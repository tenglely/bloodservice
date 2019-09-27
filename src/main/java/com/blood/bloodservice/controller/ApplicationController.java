package com.blood.bloodservice.controller;

import com.blood.bloodservice.entity.Application;
import com.blood.bloodservice.entity.Msg;
import com.blood.bloodservice.service.impl.ApplicationServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 血液申请表控制器
 * @author zyqfz
 * @date 2019/9/27 - 0:14
 */
@Api(tags = "血液申请接口")
@RestController
public class ApplicationController {
    @Autowired
    ApplicationServiceImpl applicationServiceImpl;
    //
    @ApiOperation(value ="添加血液使用申请信息" )
    @PostMapping("/doctor/addApplication")
    public Msg addApplition(Application application){
        //设置状态
        application.setState(0);
        //时间设置
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = formatter.format(currentTime);
        application.setAdate(dateString);
        int aid = applicationServiceImpl.addApplication(application);
        return Msg.success();
    }
}
