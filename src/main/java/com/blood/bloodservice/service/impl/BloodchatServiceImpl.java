package com.blood.bloodservice.service.impl;

import com.blood.bloodservice.dao.BloodchatMapper;
import com.blood.bloodservice.entity.Bloodchat;
import com.blood.bloodservice.service.BloodchatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 添加咨询信息
 * @author zyqfz
 * @date 2019/9/29 - 15:00
 */
@Service
public class BloodchatServiceImpl implements BloodchatService {
    @Autowired
    BloodchatMapper bloodchatMapper;
    @Override
    public int addBloodchat(Bloodchat bloodchat) {
        bloodchatMapper.insert(bloodchat);
        return bloodchat.getId();
    }

    //查询献血咨询信息
    @Override
    public List<Bloodchat> selectBloodchat() {

        List<Bloodchat> list = bloodchatMapper.selectByExample(null);
        if(list!=null)
            return list;
        else
            return null;
    }

}
