package com.blood.bloodservice.service;

import com.blood.bloodservice.entity.Sendblood;

/**
 * 献血记录
 * @author zyqfz
 * @date 2019/9/26 - 17:32
 */
public interface SendbloodService {

    //添加献血记录
    int addSendBlood(Sendblood sendblood);
}
