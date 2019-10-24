package com.blood.bloodservice.controller;

import com.blood.bloodservice.entity.Doctor;
import com.blood.bloodservice.entity.Msg;
import com.blood.bloodservice.service.impl.DoctorServiceImpl;
import com.blood.bloodservice.service.impl.UserloginService;
import com.blood.bloodservice.service.impl.ZrootServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.print.Doc;
import javax.websocket.server.PathParam;
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

    @ApiOperation(value = "查询pstate值为false的医护人员列表,分页查询，一页10条数据")
    @GetMapping("/admin/selectDoctor/{pn}")
    public Msg selectDoctor(@PathVariable("pn")Integer pn){
        PageHelper.startPage(pn,10);
        List<Doctor> list = doctorServiceImpl.selectDoctor();
        PageInfo pageInfo = new PageInfo(list,5);
        return Msg.success().add("pageinfo",pageInfo);

    }

    @ApiOperation(value = "根据did查询医护人员详细信息")
    @GetMapping("/admin/selectDoctorBydid/{did}")
    public Msg selectDoctor(@PathVariable("did") int did){
        Doctor doctor = doctorServiceImpl.selectbydid(did);
        return Msg.success().add("doctor" ,doctor);
    }

    @ApiOperation(value = "批准医护人员")
    @GetMapping ("/admin/updateDoctor/{did}")
    public Msg updateDoctor(@PathVariable("did") int uid) {
        Doctor doctor=doctorServiceImpl.selectbydid(uid);
        doctor.setPstate(true);
        //更新完医护人员信息
        zrootService.updateDoctor(doctor);
        //去一个字符串的最后六个字符作为密码
        String p = doctor.getDidentity();
        String pwd = p.substring(p.length()-6,p.length());
       // System.out.println(pwd);
        //顺便医护人员添加登录信息
       int did = userloginService.addUserlogin(doctor.getDid(),doctor.getDemail(),pwd,"医务人员");
        //添加角色信息
        doctorServiceImpl.addRoot(did);

       return Msg.success();
    }
}
