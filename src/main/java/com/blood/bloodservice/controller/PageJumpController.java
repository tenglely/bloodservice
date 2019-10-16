package com.blood.bloodservice.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletResponse;

/**
 * 页面跳转类
 */
@Api(tags = "登录页面跳转")
@Controller
public class PageJumpController {

    /**
     *登录页面
     */
    @ApiOperation(value = "登录页面")
    @GetMapping("/mylogin")
    public String login(HttpServletResponse response) throws Exception{
        return "login";
    }

    @ApiOperation(value = "医务人员登录页面")
    @GetMapping("/doctorlogin")
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
        return "/doctor/addcblood";
    }

}
