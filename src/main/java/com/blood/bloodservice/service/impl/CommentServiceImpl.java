package com.blood.bloodservice.service.impl;

import com.blood.bloodservice.dao.CommentMapper;
import com.blood.bloodservice.entity.Comment;
import com.blood.bloodservice.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
