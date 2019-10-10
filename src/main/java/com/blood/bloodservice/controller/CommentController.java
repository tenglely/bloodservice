package com.blood.bloodservice.controller;

import com.blood.bloodservice.entity.Comment;
import com.blood.bloodservice.entity.Msg;
import com.blood.bloodservice.entity.Userlogin;
import com.blood.bloodservice.service.impl.CommentServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Api(tags = "用户评论接口")
@RestController
public class CommentController {

    @Autowired
    private CommentServiceImpl commentService;

    @ApiOperation(value = "添加一条评论",notes="添加评论需要先登录")
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

    @ApiOperation(value = "查询所有评论")
    @PostMapping("/all/selectAllComment/{pn}")
    public Msg selectAllcomment(@PathVariable("pn")Integer pn){
        PageHelper.startPage(pn,10);
        List<Comment> list = commentService.selectallComment();
        PageInfo pageInfo = new PageInfo(list,5);
        return Msg.success().add("pageinfo",pageInfo);
    }
    @ApiOperation(value = "根据文章pid查询所有评论")
    @PostMapping("/all/selectCommentBypid/{pn}/{pid}")
    public Msg selectcommentBypid(@PathVariable("pn")Integer pn,@PathVariable("pid")Integer pid){
        PageHelper.startPage(pn,10);
        List<Comment> list = commentService.selectCommentBypid(pid);
        PageInfo pageInfo = new PageInfo(list,5);
        return Msg.success().add("pageinfo",pageInfo);
    }


}
