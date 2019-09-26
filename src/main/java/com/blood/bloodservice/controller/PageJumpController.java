package com.blood.bloodservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;

/**
 * 页面跳转类
 */
@Controller
public class PageJumpController {

    /**
     *登录页面
     */
    @GetMapping("/mylogin")
    public String login(HttpServletResponse response) throws Exception{
        return "login";
    }

    @GetMapping("/user/hello")
    @ResponseBody
    public String hello(){
        return "hello";
    }

}
