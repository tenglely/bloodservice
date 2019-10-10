package com.blood.bloodservice.service.impl;

import com.blood.bloodservice.dao.PostMapper;
import com.blood.bloodservice.entity.Post;
import com.blood.bloodservice.entity.PostExample;
import com.blood.bloodservice.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

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

    //查询文章信息
    @Override
    public List<Post> selectPost() {
        PostExample postExample = new PostExample();
        postExample.setOrderByClause("pid desc");
        List<Post> list = postMapper.selectByExample(postExample);
        if(list.isEmpty())
            return null;
        else
            return list;

    }

    //根据文章pid查询详细标题信息
    @Override
    public Post selectOnePost(Integer pid) {
        Post post = postMapper.selectByPrimaryKey(pid);
        if(post!=null) {
            return post;
        }
        else
        return null;
    }
}
