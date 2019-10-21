package com.blood.bloodservice.controller;

import com.blood.bloodservice.entity.Doctor;
import com.blood.bloodservice.entity.Msg;
import com.blood.bloodservice.service.impl.DoctorServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;

/**
 * 页面跳转类
 */
@Api(tags = "登录页面跳转")
@Controller
public class PageJumpController {
    @Autowired
    DoctorServiceImpl doctorService;

    /**
     *登录页面
     */
    @ApiOperation(value = "登录页面")
    @GetMapping("/mylogin")
    public String login(HttpServletResponse response) throws Exception{
        return "login";
    }

    @ApiOperation(value = "医务人员登录页面")
    @GetMapping("/all/doctorlogin")
    public String doctorlogin(HttpServletResponse response) throws Exception{
        return "/doctor/doctorlogin";
    }

    @ApiOperation(value = "医务人员首页")
    @GetMapping("/doctor/index")
    public String hello(){
        return "/doctor/index";
    }

    @ApiOperation(value = "添加献血活动")
    @GetMapping("/doctor/cblood.html")
    public String cblood(){
        return "doctor/addcblood";
    }

    @ApiOperation(value = "查询献血活动")
    @GetMapping("/doctor/selectcblood.html")
    public String selectcblood(){
        return "doctor/selectCblood";
    }
    @ApiOperation(value="医护人员注册页面")
    @GetMapping("/all/adddoctor.html")
    public String adddoctor(){

        return "/doctor/adddoctor";
    }

    @ApiOperation(value = "人员登记页面")
    @GetMapping("/doctor/registerpeople.html")
    public String registerhtml(){
        return "/doctor/registerpeople";
    }

    @ApiOperation(value = "添加体检信息页面")
    @GetMapping("/doctor/addcheck.html")
    public String addcheckhtml(){
        return "/doctor/addcheck";
    }

    @ApiOperation(value = "注册医护人员信息")
    @PostMapping("/all/DoctorJump")
    public String addDoctor(Doctor doctor, MultipartFile file, HttpServletRequest req){
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
            int did = doctorService.addDoctor(doctor);

        }catch (Exception e){
            e.printStackTrace();
        }
        return "/doctor/doctorlogin";
    }

}
