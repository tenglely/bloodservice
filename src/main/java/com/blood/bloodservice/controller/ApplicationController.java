package com.blood.bloodservice.controller;

import com.blood.bloodservice.entity.Application;
import com.blood.bloodservice.entity.Doctor;
import com.blood.bloodservice.entity.Msg;
import com.blood.bloodservice.entity.Userlogin;
import com.blood.bloodservice.service.impl.ApplicationServiceImpl;
import com.blood.bloodservice.service.impl.DoctorServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 血液申请表控制器
 * @author zyqfz
 * @date 2019/9/27 - 0:14
 */
@Api(tags = "血液申请接口")
@RestController
public class ApplicationController {
    @Autowired
    ApplicationServiceImpl applicationServiceImpl;

    @Autowired
    DoctorServiceImpl doctorServiceImpl;
    //
    @ApiOperation(value ="添加血液使用申请信息,需医务人员登录" )
    @PostMapping("/doctor/addApplication")
    public Msg addApplition(Application application){
        Userlogin userlogin= (Userlogin) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        application.setYid(userlogin.getUid());
        //设置状态
        application.setState(0);
        //时间设置
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = formatter.format(currentTime);
        application.setAdate(dateString);
        int aid = applicationServiceImpl.addApplication(application);
        return Msg.success();
    }

    @ApiOperation(value = "医务人员查看自己的所有申请记录")
    @GetMapping("/doctor/finddoctorapply")
    public Msg finddoctorapply(){
        Userlogin userlogin = (Userlogin) SecurityContextHolder.getContext().getAuthentication();
        List<Application> list=applicationServiceImpl.selectByYid(userlogin.getUid());
        return Msg.success().add("list",list);
    }

    @ApiOperation(value ="添加页面显示时查询出医护人员id信息" )
    @GetMapping("/doctor/showdid")
    public Msg addApplition(){
        Userlogin userlogin = (Userlogin) SecurityContextHolder.getContext().getAuthentication();
         return Msg.success().add("did",userlogin.getUid());
    }


    @ApiOperation(value ="查询出申请列表信息含医护人员信息,分页一页10条" )
    @GetMapping("/doctor/selectAllapplication/{pn}")
    public Msg selectAllapplition(@PathVariable("pn")Integer pn){
        PageHelper.startPage(pn,10);
        List<Application> list = applicationServiceImpl.selectAllapplication();
        PageInfo pageInfo = new PageInfo(list,5);
        return Msg.success().add("pageinfo",pageInfo);
    }

    @ApiOperation(value ="根据aid查询出申请详细信息含医护人员信息" )
    @GetMapping("/doctor/selectOneapplication/{aid}")
    public Msg selectOneapplition(@PathVariable("aid") Integer aid){
       Application application = applicationServiceImpl.selectOneApplication(aid);
       //根据医护人员did查询出医护人员信息
       Doctor doctor = doctorServiceImpl.selectbydid(application.getYid());
        return Msg.success().add("application",application).add("doctor",doctor);
    }

    @ApiOperation(value ="根据申请状态state查询出申请列表信息含医护人员信息,分页一页10条" )
    @GetMapping("/doctor/selectapplicationBystate/{pn}/{state}")
    public Msg selectapplitionBystate(@PathVariable("state") Integer state,@PathVariable("pn") Integer pn){
        PageHelper.startPage(pn,10);
        List<Application> list = applicationServiceImpl.selectApplicationBystate(state);
        //保存医护人员的名字列表
        List<Doctor> listdoctor = new ArrayList<>();
        for(Application a : list){
            Doctor doctor = doctorServiceImpl.selectbydid(a.getYid());
            listdoctor.add(doctor);
        }
        PageInfo pageInfo = new PageInfo(list,5);
        return Msg.success().add("pageinfo",pageInfo).add("listdoctor",listdoctor);
    }
}
