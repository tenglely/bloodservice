package com.blood.bloodservice.service.impl;

import com.blood.bloodservice.dao.BtargetMapper;
import com.blood.bloodservice.entity.Btarget;
import com.blood.bloodservice.service.BtargetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 检测指标
 * @author zyqfz
 * @date 2019/9/27 - 11:19
 */
@Service
public class BtargetServiceImpl implements BtargetService {
    @Autowired
    BtargetMapper btargetMapper;
    @Override
    public int addBtarget(Btarget btarget) {
        btargetMapper.insert(btarget);
        return btarget.getId();
    }
}
