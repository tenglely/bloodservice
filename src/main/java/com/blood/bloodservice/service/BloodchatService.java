package com.blood.bloodservice.service;

import com.blood.bloodservice.entity.Bloodchat;

import java.util.List;

/**
 * 咨询信息表
 * @author zyqfz
 * @date 2019/9/29 - 14:58
 */
public interface BloodchatService {
    public int addBloodchat(Bloodchat bloodchat);

    public List<Bloodchat> selectBloodchat();
}
