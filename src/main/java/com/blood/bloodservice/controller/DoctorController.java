package com.blood.bloodservice.controller;

import com.blood.bloodservice.entity.Doctor;
import com.blood.bloodservice.entity.Msg;
import com.blood.bloodservice.service.impl.DoctorServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import javax.servlet.http.HttpServletRequest;
import java.io.File;

/**
 * @author zyqfz
 * @date 2019/9/28 - 15:56
 */
@Api(tags = "医护人员信息接口")
@RestController
public class DoctorController {

    @Autowired
    DoctorServiceImpl doctorServiceImpl;

    @ApiOperation(value = "注册医护人员信息")
    @PostMapping("/doctor/addDoctor")
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
                    req.getServerPort() +"/src/main/resources/static/images/ "+ newname;

            doctor.setDphoto(filePath);
           int did = doctorServiceImpl.addDoctor(doctor);

        }catch (Exception e){

            e.printStackTrace();
        }


return Msg.success();


    }
}
