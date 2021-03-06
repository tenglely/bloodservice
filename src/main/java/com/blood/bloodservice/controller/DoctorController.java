package com.blood.bloodservice.controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.blood.bloodservice.entity.Doctor;
import com.blood.bloodservice.entity.Msg;
import com.blood.bloodservice.entity.Userlogin;
import com.blood.bloodservice.service.impl.DoctorServiceImpl;
import com.blood.bloodservice.service.impl.UserloginService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.print.Doc;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.List;

/**
 * @author zyqfz
 * @date 2019/9/28 - 15:56
 */
@Api(tags = "医护人员信息接口")
@RestController
public class DoctorController {

    @Autowired
    DoctorServiceImpl doctorServiceImpl;
    @Autowired
    RedisTemplate redisTemplate;

    @Autowired
    UserloginService userloginService;

    @ApiOperation(value = "把医务人员的操作信息的最新的10条显示出来")
    @GetMapping("/doctor/selectallmessage")
    public Msg selectallmessage(){
        int length = redisTemplate.opsForList().size("newlist").intValue();
        List<String> list=redisTemplate.opsForList().range("newlist",length-10,length);
        return Msg.success().add("newlist",list
        );
    }

    @ApiOperation(value = "管理员根据医院查找医务人员")
    @GetMapping("/admin/finddoctorbyhospital/{dwork}")
    public Msg finddoctorbyhospital(@PathVariable("dwork")String dwork){
        List<Doctor> list=doctorServiceImpl.findbyhospital(dwork);
        return Msg.success().add("list",list);
    }


    @ApiOperation(value = "管理员，查询全部医务人员")
    @GetMapping("/admin/findalldoctor/{pn}")
    public Msg findalldoctor(@PathVariable("pn") Integer pn){
        PageHelper.startPage(pn,10);
        List<Doctor> list=doctorServiceImpl.findalldoctor();
        PageInfo page = new PageInfo(list,5);
        return Msg.success().add("list",page);
    }

    @ApiOperation(value = "医务人员，查询同一医院的医务人员")
    @GetMapping("/doctor/findbyhospital")
    public Msg findByHospitol(){
        //获取用户登录信息
        Userlogin userlogin= (Userlogin) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        //查找医生
        Doctor doctor=doctorServiceImpl.selectbydid(userlogin.getUid());
        //查找同一医院医生
        List<Doctor> list=doctorServiceImpl.findbyhospital(doctor.getDwork());
        return Msg.success().add("list",list);
    }

    @ApiOperation(value = "注册医护人员信息")
    @PostMapping("/all/addDoctor")
    public Msg addDoctor(Doctor doctor, MultipartFile file, HttpServletRequest req){
        try {
            //保存上传的文件路径
            File f = new File("");
            String realpath = f.getAbsolutePath() + "/src/main/resources/static/images/";

            //设置文件名字
            String newname = file.getOriginalFilename();

            //创建新文件
            File f2 = new File(realpath + newname);
            file.transferTo(f2);
            String filePath = req.getScheme() + "://"+req.getServerName() + ":" +
                    req.getServerPort() +"/images/ "+ newname;

            doctor.setDphoto(filePath);
            doctor.setDstate(true);
            doctor.setPstate(false);
           int did = doctorServiceImpl.addDoctor(doctor);

        }catch (Exception e){
            e.printStackTrace();
        }
        return Msg.success();
    }
    @ApiOperation(value = "医务人员查询个人信息")
    @GetMapping("/doctor/selectdoctor/{did}")
    public Msg selectdoctor(@PathVariable("did")Integer did){
        //查找医生
        System.out.printf("查到");
        Doctor doctor=doctorServiceImpl.selectbydid(did);
        return Msg.success().add("doctor",doctor);
    }

    @ApiOperation(value = "医务人员查询个人信息")
    @GetMapping("/doctor/selectonedoctor")
    public Msg selectdoctor(){
        Userlogin userlogin = (Userlogin) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        //查找医生
        Doctor doctor=doctorServiceImpl.selectbydid(userlogin.getUid());
        return Msg.success().add("doctor",doctor);
    }
    @ApiOperation(value = "修改个人信息")
    @PostMapping("/doctor/update")
    public Msg updatedoctor( HttpServletRequest req,String dname,String dsex,String didentity,String daddress,String dnation,String dphone,String demail){
           int i =  doctorServiceImpl.updateDoctor(dname,dsex,didentity,daddress,dnation,dphone,demail);

          String pwd = didentity.substring(didentity.length()-6,didentity.length());
           int j = userloginService.updateUserlogin(demail,pwd);
    if(i>0)
    return Msg.success();
    return Msg.fail();
    }
}
