package com.blood.bloodservice.service;

import com.blood.bloodservice.entity.Comment;

import java.util.List;

/**
 * 评论类接口
 */
public interface CommentService {

    int addcomment(Comment comment);

    //查询所有评论列表
    List<Comment> selectallComment();

    //根据文章pid查询评论列表
    List<Comment> selectCommentBypid(Integer pid);

}
