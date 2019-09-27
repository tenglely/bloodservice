package com.blood.bloodservice.controller;

import com.blood.bloodservice.entity.*;
import com.blood.bloodservice.service.impl.ContentServiceImpl;
import com.blood.bloodservice.service.impl.PeopleServiceImpl;
import com.blood.bloodservice.service.impl.PostServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
@Api(tags = "文章信息与内容接口")
@RestController
public class PostController {
    @Autowired
    private PostServiceImpl postService;
    @Autowired
    private PeopleServiceImpl peopleService;
    @Autowired
    private ContentServiceImpl contentService;

    @ApiOperation(value = "添加文章信息和文章内容信息")
    @PostMapping("/all/addpost")
    public Msg addPost(String title,String ptype,String content){
        //获取用户登录信息
        Userlogin userlogin= (Userlogin) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        //获取用户详细信息
        People people=peopleService.selectonebyid(userlogin.getUid());
        System.out.println(people);
        //添加文章信息
        int pid=postService.addpost(title,ptype,userlogin.getUid(),userlogin.getUtype(),people.getUname());
        if(pid==0)
            return Msg.fail().add("error","添加文章出错!!");
        //添加文章内容信息
        Content content1=new Content();
        content1.setPid(pid);
        content1.setContent(content);
        int cid=contentService.addcontent(content1);
        if(cid==0)
            return Msg.fail().add("error","添加文章内容出错!!");
        return Msg.success();
    }

}
