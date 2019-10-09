package com.blood.bloodservice.controller;

import com.blood.bloodservice.entity.Application;
import com.blood.bloodservice.entity.Msg;
import com.blood.bloodservice.entity.Userlogin;
import com.blood.bloodservice.service.impl.ApplicationServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.plugin.liveconnect.SecurityContextHelper;

import javax.websocket.server.PathParam;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

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
    @ApiOperation(value ="显示出医护人员id信息" )
    @GetMapping("/doctor/showdid")
    public Msg addApplition(){
        Userlogin userlogin = (Userlogin) SecurityContextHolder.getContext().getAuthentication();
         return Msg.success().add("did",userlogin.getUid());
    }


    @ApiOperation(value ="查询出申请列表信息含医护人员信息,分页" )
    @GetMapping("/doctor/selectAllapplication/{pn}")
    public Msg selectAllapplition(@PathVariable("pn") Integer pn){
        PageHelper.startPage(pn,10);
        List<Application> list = applicationServiceImpl.selectAllapplication();
        PageInfo pageInfo = new PageInfo(list,5);
        return Msg.success().add("pageinfo",pageInfo);
    }
}
