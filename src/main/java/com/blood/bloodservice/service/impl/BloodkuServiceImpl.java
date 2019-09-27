package com.blood.bloodservice.service.impl;

import com.blood.bloodservice.dao.BloodkuMapper;
import com.blood.bloodservice.entity.Bloodku;
import com.blood.bloodservice.service.BloodkuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 血库添加
 * @author zyqfz
 * @date 2019/9/26 - 23:26
 */
@Service
public class BloodkuServiceImpl implements BloodkuService {
    @Autowired
    BloodkuMapper bloodkuMapper;
    @Override
    public int addBloodku(Bloodku bloodku) {
        bloodkuMapper.insert(bloodku);
        return bloodku.getBid();
    }
}
