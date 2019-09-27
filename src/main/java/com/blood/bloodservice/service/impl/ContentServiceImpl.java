package com.blood.bloodservice.service.impl;

import com.blood.bloodservice.dao.ContentMapper;
import com.blood.bloodservice.entity.Content;
import com.blood.bloodservice.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContentServiceImpl implements ContentService {
    @Autowired
    private ContentMapper contentMapper;

    @Override
    public int addcontent(Content content) {
        int i=contentMapper.insert(content);
        if(i>0)
         return content.getCid();
        else
         return 0;
    }
}
