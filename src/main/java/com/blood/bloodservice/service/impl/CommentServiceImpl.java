package com.blood.bloodservice.service.impl;

import com.blood.bloodservice.dao.CommentMapper;
import com.blood.bloodservice.entity.Comment;
import com.blood.bloodservice.entity.CommentExample;
import com.blood.bloodservice.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentMapper commentMapper;

    @Override
    public int addcomment(Comment comment) {
        int id=commentMapper.insert(comment);
        if(id>0)
            return comment.getId();
        else
            return 0;
    }

    //查询所有评论列表
    @Override
    public List<Comment> selectallComment() {
        CommentExample commentExample = new CommentExample();
        commentExample.setOrderByClause("id desc");
        List<Comment> list = commentMapper.selectByExample(commentExample);
        if(list.isEmpty())
            return null;
        else
            return list;

    }
    //根据文章pid 查询所有评论列表
    @Override
    public List<Comment> selectCommentBypid(Integer pid) {
        CommentExample commentExample = new CommentExample();
        commentExample.setOrderByClause("id desc");
        CommentExample.Criteria criteria = commentExample.createCriteria();
        criteria.andPidEqualTo(pid);
        List<Comment> list = commentMapper.selectByExample(commentExample);
        if(list.isEmpty())
            return null;
        else
            return list;
    }


}
