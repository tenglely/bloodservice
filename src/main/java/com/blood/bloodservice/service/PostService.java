package com.blood.bloodservice.service;

import com.blood.bloodservice.entity.Post;

import java.util.List;

/**
 * 文章信息表
 * post接口
 */
public interface PostService {
    /**
     * 添加文章信息post
     * @param
     * @return
     */
    int addpost(String title,String ptype,int uid,String utype,String uname);

    //查询文章信息
    List<Post> selectPost();

    //根据文章id查询标题详细信息
    Post selectOnePost(Integer pid);
}
