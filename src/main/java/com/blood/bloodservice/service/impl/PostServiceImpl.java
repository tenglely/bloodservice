package com.blood.bloodservice.service.impl;

import com.blood.bloodservice.dao.PostMapper;
import com.blood.bloodservice.entity.Post;
import com.blood.bloodservice.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class PostServiceImpl implements PostService {
    @Autowired
    private PostMapper postMapper;


    @Override
    public int addpost(String title, String ptype, int uid, String utype, String uname) {
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = formatter.format(currentTime);
        Post post=new Post();
        post.setTitle(title);
        post.setUid(uid);
        post.setPdate(dateString);
        post.setNumber(0);
        post.setPtype(ptype);
        post.setPname(uname);
        post.setUtype(utype);
        int i=postMapper.insert(post);
        if(i>0)
           return post.getPid();
        else
            return 0;
    }
}
