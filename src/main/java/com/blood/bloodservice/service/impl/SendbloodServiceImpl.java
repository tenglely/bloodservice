package com.blood.bloodservice.service.impl;

import com.blood.bloodservice.dao.SendbloodMapper;
import com.blood.bloodservice.entity.Sendblood;
import com.blood.bloodservice.service.SendbloodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *献血记录
 * @author zyqfz
 * @date 2019/9/26 - 17:34
 */
@Service
public class SendbloodServiceImpl implements SendbloodService {

    @Autowired
    SendbloodMapper sendbloodMapper;
    @Override
    public int addSendBlood(Sendblood sendblood) {

        sendbloodMapper.insert(sendblood);
        return sendblood.getBid();
    }
}
