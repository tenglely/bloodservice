package com.blood.bloodservice.controller;

import com.blood.bloodservice.entity.Checkagain;
import com.blood.bloodservice.entity.Doctor;
import com.blood.bloodservice.entity.Msg;
import com.blood.bloodservice.entity.People;
import com.blood.bloodservice.service.impl.CheckAgainServiceImpl;
import com.blood.bloodservice.service.impl.DoctorServiceImpl;
import com.blood.bloodservice.service.impl.PeopleServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * 二次检测结果控制器
 * @author zyqfz
 * @date 2019/9/27 - 0:00
 */
@Api(tags = "二次检测结果信息")
@RestController
public class CheckAgainController {
    @Autowired
    CheckAgainServiceImpl checkAgainServiceImpl;

    @Autowired
    PeopleServiceImpl peopleServiceImpl;
    @Autowired
    DoctorServiceImpl doctorServiceImpl;

    @ApiOperation(value = "添加二次检测结果")
    @PostMapping("/doctor/addCheckAgain")
    public Msg addCheckAgain(Checkagain checkagain){
        int cid = checkAgainServiceImpl.addCheckAgain(checkagain);
        return Msg.success();
    }

    @ApiOperation(value = "查询二次检测结果")
    @GetMapping("/doctor/selectCheckagain/{pn}")
    public Msg selectCheckagain(@PathVariable("pn")Integer pn){

        PageHelper.startPage(pn,10);
        List<Checkagain> list = checkAgainServiceImpl.selectCheckagain();
        List<String> listPeoplename = new ArrayList<>();
        List<String> listDoctorname = new ArrayList<>();
        for(Checkagain c : list){
            People people = peopleServiceImpl.selectonebyid(c.getUid());
            Doctor doctor = doctorServiceImpl.selectbydid(c.getYid());
            listPeoplename.add(people.getUname());
            listDoctorname.add(doctor.getDname());
        }
        PageInfo pageInfo = new PageInfo(list,5);
        System.out.println(pageInfo);
        return Msg.success().add("pageinfo",pageInfo).add("listpeoplename",listPeoplename).add("listdoctorname",listDoctorname);
    }
}
