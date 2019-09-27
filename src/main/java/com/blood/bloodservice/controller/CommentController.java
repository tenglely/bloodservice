package com.blood.bloodservice.controller;

import com.blood.bloodservice.entity.Comment;
import com.blood.bloodservice.entity.Msg;
import com.blood.bloodservice.entity.Userlogin;
import com.blood.bloodservice.service.impl.CommentServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@Api(tags = "用户评论接口")
@RestController
public class CommentController {

    @Autowired
    private CommentServiceImpl commentService;

    @ApiOperation(value = "添加一条评论")
    @PostMapping("/user/addComment")
    public Msg addComment(String content,Integer pid){
        //获取用户登录信息
        Userlogin userlogin= (Userlogin) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        Comment comment=new Comment();
        comment.setPid(pid);
        comment.setContent(content);
        comment.setUid(userlogin.getUid());
        comment.setUsertype(userlogin.getUtype());
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = formatter.format(currentTime);
        comment.setCdate(dateString);
        //添加评论信息
        int id=commentService.addcomment(comment);
        if(id==0)
            return Msg.fail().add("error","添加评论失败");
        return Msg.success();
    }


}
