package com.blood.bloodservice.controller;

import com.blood.bloodservice.entity.Doctor;
import com.blood.bloodservice.entity.Msg;
import com.blood.bloodservice.entity.Userlogin;
import com.blood.bloodservice.service.impl.DoctorServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
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
}
