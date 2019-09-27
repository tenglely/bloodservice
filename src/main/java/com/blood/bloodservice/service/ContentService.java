package com.blood.bloodservice.service;

import com.blood.bloodservice.entity.Content;

/**
 * 文章内容表接口
 */
public interface ContentService {

    /**
     * 添加文章内容
     * @param content
     * @return
     */
    int addcontent(Content content);
}
