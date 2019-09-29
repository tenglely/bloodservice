package com.blood.bloodservice.controller;

import com.alibaba.druid.support.json.JSONUtils;
import com.blood.bloodservice.entity.Doctor;
import com.blood.bloodservice.entity.Msg;
import com.blood.bloodservice.service.impl.DoctorServiceImpl;
import com.blood.bloodservice.service.impl.UserloginService;
import com.blood.bloodservice.service.impl.ZrootServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import redis.clients.jedis.JedisCluster;
import springfox.documentation.spring.web.json.Json;

import java.util.List;

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

    @Autowired
    private DoctorServiceImpl doctorServiceImpl;

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

    @ApiOperation(value = "查询所有医护人员")
    @GetMapping("/admin/selectDoctor")
    public List<Doctor> selectDoctor(){
        //存入redis
        JedisCluster jedisCluster = new JedisCluster();

        List<Doctor> list = doctorServiceImpl.selectDoctor();
        String  l = JSONUtils.toJSONString(list);
        jedisCluster.set("doctorlist",l);

        return doctorServiceImpl.selectDoctor();
    }

    @ApiOperation(value = "批准医护人员")
    @PostMapping ("/admin/updateDoctor")
    public Msg updateDoctor(Doctor doctor) {
        //更新完医护人员信息
        zrootService.updateDoctor(doctor);
        //去一个字符串的最后六个字符作为密码
        String p = doctor.getDidentity();
        String pwd = p.substring(p.length()-6,p.length());
       // System.out.println(pwd);
        //顺便医护人员添加登录信息
       int did = userloginService.addUserlogin(doctor.getDid(),doctor.getDemail(),pwd,"医护人员");
        //添加角色信息
        doctorServiceImpl.addRoot(did);

       return Msg.success();
    }
}
