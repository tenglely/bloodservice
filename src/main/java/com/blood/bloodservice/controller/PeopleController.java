package com.blood.bloodservice.controller;

import com.blood.bloodservice.entity.Msg;
import com.blood.bloodservice.entity.People;
import com.blood.bloodservice.service.PeopleService;
import com.blood.bloodservice.service.impl.RegisterServiceImpl;
import com.blood.bloodservice.service.impl.UserloginService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 处理献血人员的控制器
 * @author zyqfz
 * @date 2019/9/26 - 13:44
 */
@Api(tags = "献血人员信息")
@RestController
public class PeopleController {
    @Autowired
    PeopleService peopleService;
    @Autowired
    RegisterServiceImpl registerService;
    @Autowired
    UserloginService userloginService;

    @ApiOperation(value = "管理员，查看所有用户信息，分页，一页10条")
    @GetMapping("/admin/findallpeople/{pn}")
    public Msg findallpeople(@PathVariable("pn")Integer pn){
        PageHelper.startPage(pn,10);
        List<People> list=peopleService.selectall();
        PageInfo page = new PageInfo(list,5);
        return Msg.success().add("list",page);
    }

    @ApiOperation(value = "工作人员注册献血人员信息，并添加登记表信息,返回用户信息people",
    notes = "填入用户信息people，和登记地址编号baid")
    @PostMapping("/doctor/addPeoplebydoctor")
    public Msg addPeopleBydoctor(People people,int baid){
        //查询身份证，看该用户是否已存在
        People pp=peopleService.selectbyidenty(people.getUidentity());
        if(pp!=null)
            return Msg.success().add("people",pp);
        //添加用户信息到people表
        int uid= peopleService.addPeople(people);
        //System.out.println(uid);
        //去一个字符串的最后六个字符作为密码
        String p = people.getUidentity();
        String pwd = p.substring(p.length()-6,p.length());
        //System.out.println(pwd);
        //根据用户id添加献血人员的数据到表userlogin中
        int did = userloginService.addUserlogin(uid,people.getUemail(),pwd,"用户");
        //根据登录id添加权限对象给献血人员
        peopleService.addRoot(did);
        //添加登记表信息
        int id=registerService.addRegister(uid,baid);
        return Msg.success().add("people",people);
    }

    @ApiOperation(value = "工作人员根据用户身份证查找用户，然后添加登记表信息",
    notes = "uidertity身份证号,bid登录地点编号")
    @PostMapping("/doctor/checkPeopleAndAddRegister")
    public Msg checkPeople(String uidertity,int bid){
        //查询身份证，看该用户是否已存在
        People pp=peopleService.selectbyidenty(uidertity);
        if(pp==null)
            return Msg.fail().add("state","该用户不存在!!!");
        //添加登记表信息
        int id=registerService.addRegister(pp.getUid(),bid);
        return Msg.success().add("state","用户登记成功");
    }

    @ApiOperation(value = "献血人员信息注册")
    @PostMapping("/all/addPeople")
    public Msg addPeople(People people){
        //查询身份证，看该用户是否已存在
        People pp=peopleService.selectbyidenty(people.getUidentity());
        if(pp!=null)
            return Msg.fail().add("error","该用户已存在!!!");
        //添加用户信息到people表
       int uid= peopleService.addPeople(people);
       System.out.println(uid);
      //去一个字符串的最后六个字符作为密码
       String p = people.getUidentity();
       String pwd = p.substring(p.length()-6,p.length());
        System.out.println(pwd);
        //根据用户id添加献血人员的数据到表userlogin中
       int did = userloginService.addUserlogin(uid,people.getUemail(),pwd,"用户");
       //根据登录id添加权限对象给献血人员
       peopleService.addRoot(did);
       return Msg.success();
    }
}
