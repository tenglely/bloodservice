package com.blood.bloodservice.controller;

import com.blood.bloodservice.entity.Doctor;
import com.blood.bloodservice.entity.Msg;
import com.blood.bloodservice.entity.People;
import com.blood.bloodservice.entity.Useblood;
import com.blood.bloodservice.service.impl.DoctorServiceImpl;
import com.blood.bloodservice.service.impl.PeopleServiceImpl;
import com.blood.bloodservice.service.impl.UsebloodServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 血液使用情况控制器
 * @author zyqfz
 * @date 2019/9/27 - 8:29
 */
@Api(tags = "血液使用情况")
@RestController
public class UsebloodController {
    @Autowired
    UsebloodServiceImpl usebloodServiceImpl;
    @Autowired
    DoctorServiceImpl doctorServiceImpl;


    @ApiOperation(value = "添加血液使用情况")
    @PostMapping("/admin/appUseblood")
    public Msg addUseblood(Useblood useblood){

        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = formatter.format(currentTime);
        useblood.setGdate(dateString);
        int id = usebloodServiceImpl.addUseblood(useblood);
        return Msg.success();
    }

    @ApiOperation(value = "查询血液使用列表")
    @GetMapping("/doctor/selectAllUseblood/{pn}")
    public Msg selectAllUseblood(@PathVariable("pn")Integer pn){
        PageHelper.startPage(pn,10);
        List<Useblood> list = usebloodServiceImpl.selectAllUseblood();
        //查询出医护人员信息
        List<String> listdoctorname = new ArrayList<>();
        for(Useblood u :list){
           Doctor doctor = doctorServiceImpl.selectbydid(u.getYid());
           listdoctorname.add(doctor.getDname());
        }
        PageInfo pageInfo = new PageInfo(list,5);
        return Msg.success().add("pageinfo",pageInfo).add("listdoctorname",listdoctorname);

    }

    @ApiOperation(value = "根据id查询血液使用详细")
    @GetMapping("/doctor/selectOneUseblood/{id}")
    public Msg selectOneUseblood(@PathVariable("id")Integer id){

        Useblood useblood = usebloodServiceImpl.selectOneUseblood(id);
        Doctor doctor = doctorServiceImpl.selectbydid(useblood.getYid());

        return Msg.success().add("useblood",useblood).add("doctor",doctor);

    }

    @ApiOperation(value = "查询血液使用列表")
    @GetMapping("/doctor/selectUsebloodBystate/{pn}/{state}")
    public Msg selectUsebloodBystate(@PathVariable("pn")Integer pn,@PathVariable("state")Boolean state){
        PageHelper.startPage(pn,10);
        List<Useblood> list = usebloodServiceImpl.selectUsebloodBystate(state);
        //查询出医护人员信息
        List<String> listdoctorname = new ArrayList<>(

        );
        for(Useblood u :list){
            Doctor doctor = doctorServiceImpl.selectbydid(u.getYid());
            listdoctorname.add(doctor.getDname());
        }
        PageInfo pageInfo = new PageInfo(list,5);
        return Msg.success().add("pageinfo",pageInfo).add("listdoctorname",listdoctorname);

    }
}
