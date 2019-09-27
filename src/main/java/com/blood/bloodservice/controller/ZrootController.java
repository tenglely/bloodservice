package com.blood.bloodservice.controller;

import com.blood.bloodservice.entity.Msg;
import com.blood.bloodservice.service.impl.UserloginService;
import com.blood.bloodservice.service.impl.ZrootServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 管理员控制类
 */
@Api(tags = "管理员信息")
@RestController
public class ZrootController {
    @Autowired
    private ZrootServiceImpl zrootService;
    @Autowired
    private UserloginService userloginService;

    @ApiOperation(value = "添加管理员")
    @PostMapping("/admin/addzroot")
    public Msg addZroot(String gname, String gsex, String gemail, String gphone, String upassword) {
        //添加管理员信息  (zroot)
        int gid = zrootService.addZroot(gname, gsex, gemail, gphone);
        //添加登陆表信息
        int did = userloginService.addUserlogin(gid, gemail, upassword, "管理员");
        //添加权限对象
        zrootService.addRoot(did);
        return Msg.success();
    }

    /* public Msg addZroot(Zroot zroot,String upassword){
        //添加管理员信息  (zroot)
        int gid=zrootService.addZroot(zroot);
        //添加登陆表信息
        int did=userloginService.addUserlogin(gid,zroot.getGemail(),upassword,"管理员");
        //添加权限对象
        zrootService.addRoot(did);
        return Msg.success();
    }*/
}
