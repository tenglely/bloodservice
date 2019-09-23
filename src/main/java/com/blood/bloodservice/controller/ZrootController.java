package com.blood.bloodservice.controller;

import com.blood.bloodservice.entity.Msg;
import com.blood.bloodservice.entity.Zroot;
import com.blood.bloodservice.service.UserloginService;
import com.blood.bloodservice.service.impl.ZrootServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 管理员控制类
 */
@RestController
public class ZrootController {
    @Autowired
    private ZrootServiceImpl zrootService;
    @Autowired
    private UserloginService userloginService;

    @PostMapping("/all/addzroot")
    public Msg addZroot(String gname,String gsex,String gemail,String gphone,String upassword){
        //添加管理员信息  (zroot)
        int gid=zrootService.addZroot(gname,gsex,gemail,gphone);
        //添加登陆表信息
        userloginService.addUserlogin(gid,gemail,upassword,"管理员");
        return Msg.success();
    }
}
