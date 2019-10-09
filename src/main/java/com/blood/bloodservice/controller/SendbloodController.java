package com.blood.bloodservice.controller;

import com.blood.bloodservice.entity.*;
import com.blood.bloodservice.service.impl.DoctorServiceImpl;
import com.blood.bloodservice.service.impl.PeopleServiceImpl;
import com.blood.bloodservice.service.impl.SendbloodServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.List;

/**
 * 献血记录
 * @author zyqfz
 * @date 2019/9/26 - 17:36
 */
@Api(tags = "献血记录信息")
@RestController
public class SendbloodController {
    @Autowired
    SendbloodServiceImpl sendbloodServiceImpl;
    @Autowired
    PeopleServiceImpl peopleService;
    @Autowired
    DoctorServiceImpl doctorService;


    @ApiOperation(value = "添加献血记录信息")
    @PostMapping("/doctor/addSendblood")
    public Msg addSendblood(Sendblood sendblood)
    {
        int bid = sendbloodServiceImpl.addSendBlood(sendblood);
        return Msg.success();
    }

    @ApiOperation(value = "管理员查看所有献血记录,分页-页10条.返回献血记录，用户信")
    @GetMapping("/admin/findallsendblood/{pn}")
    public Msg findallsendblood(@PathVariable("pn")Integer pn){
        PageHelper.startPage(pn,10);
        List<Sendblood> blist=sendbloodServiceImpl.selectall();
        List<People> plist=new ArrayList<>();
        List<Doctor> dlist=new ArrayList<>();
        for(Sendblood sendblood:blist){
            plist.add(peopleService.selectonebyid(sendblood.getUid()));
            dlist.add(doctorService.selectbydid(sendblood.getYid()));
        }
        PageInfo page = new PageInfo(blist,5);
        return Msg.success().add("blist",page).add("plist",plist).add("dlist",dlist);
    }

    @ApiOperation(value = "用户查看自己的献血记录,需要用户登录")
    @GetMapping("/user/findpeoplesendblood")
    public Msg findpeoplesendblood(){
        Userlogin userlogin= (Userlogin) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        List<Sendblood> blist=sendbloodServiceImpl.selectbyuid(userlogin.getUid());
        if(blist==null)
            return Msg.fail();
        List<Doctor> dlist=new ArrayList<>();
        for(Sendblood sendblood:blist){
            dlist.add(doctorService.selectbydid(sendblood.getYid()));
        }
        return Msg.success().add("blist",blist).add("dlist",dlist);
    }

    @ApiOperation(value = "医务人员查看自己负责过的献血记录，需要医务人员登录")
    @GetMapping("/doctor/finddoctorsendblood/{pn}")
    public Msg findfoctorsendblood(@PathVariable("pn") Integer pn){
        Userlogin userlogin= (Userlogin) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        PageHelper.startPage(pn,10);
        List<Sendblood> blist=sendbloodServiceImpl.selectbyyid(userlogin.getUid());
        if(blist==null)
            return Msg.fail();
        List<People> plist=new ArrayList<>();
        for(Sendblood sendblood:blist){
            plist.add(peopleService.selectonebyid(sendblood.getUid()));
        }
        PageInfo page = new PageInfo(blist,5);
        return Msg.success().add("blist",blist).add("plist",page);
    }
}
