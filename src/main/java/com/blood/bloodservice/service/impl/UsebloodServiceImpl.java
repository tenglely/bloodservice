package com.blood.bloodservice.service.impl;

import com.blood.bloodservice.dao.UsebloodMapper;
import com.blood.bloodservice.entity.Useblood;
import com.blood.bloodservice.service.UsebloodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 血液使用情况表
 * @author zyqfz
 * @date 2019/9/27 - 8:24
 */
@Service
public class UsebloodServiceImpl implements UsebloodService {
    @Autowired
    UsebloodMapper usebloodMapper;
    @Override
    public int addUseblood(Useblood useblood) {
        usebloodMapper.insert(useblood);
        return useblood.getId();
    }
}
