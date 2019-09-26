package com.blood.bloodservice.controller;

import com.blood.bloodservice.entity.Msg;
import com.blood.bloodservice.entity.People;
import com.blood.bloodservice.service.PeopleService;
import com.blood.bloodservice.service.impl.UserloginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 处理献血人员的控制器
 * @author zyqfz
 * @date 2019/9/26 - 13:44
 */
@RestController
public class PeopleController {
    @Autowired
    PeopleService peopleService;

    @Autowired
    UserloginService userloginService;

    //添加献血人员信息
    @PostMapping("/all/addPeople")
    public Msg addPeople(People people){

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
