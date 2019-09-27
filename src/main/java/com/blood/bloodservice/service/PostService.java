package com.blood.bloodservice.service;

import com.blood.bloodservice.entity.Post;

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
}
