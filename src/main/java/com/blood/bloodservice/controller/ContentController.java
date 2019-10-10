package com.blood.bloodservice.controller;

import com.blood.bloodservice.entity.Content;
import com.blood.bloodservice.entity.Msg;
import com.blood.bloodservice.entity.Post;
import com.blood.bloodservice.service.impl.ContentServiceImpl;
import com.blood.bloodservice.service.impl.PostServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author zyqfz
 * @date 2019/10/9 - 11:36
 */
@Api(tags = "文章内容管理")
@RestController
public class ContentController {
    @Autowired
    ContentServiceImpl contentServiceImpl;

    @Autowired
    PostServiceImpl postServiceImpl;



    @ApiOperation(value = "根据文章pid查询文章内容")
    @GetMapping("/all/selectContent/{pid}")
    public Msg selectPost(@PathVariable("pid")Integer pid){
        //显示标题内容
        Post post = postServiceImpl.selectOnePost(pid);
        Content content = contentServiceImpl.selectContentBypid(pid);
        return Msg.success().add("content",content).add("post",post);
    }
}
