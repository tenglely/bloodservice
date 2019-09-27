package com.blood.bloodservice.service.impl;

import com.blood.bloodservice.dao.CbloodMapper;
import com.blood.bloodservice.entity.Cblood;
import com.blood.bloodservice.service.CbloodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zyqfz
 * @date 2019/9/26 - 15:25
 */
@Service
public class CbloodServiceImpl implements CbloodService {

    @Autowired
    CbloodMapper cbloodMapper;

    //添加献血通知表信息
    @Override
    public int addCblood(Cblood cblood) {

      cbloodMapper.insert(cblood);
        return  cblood.getCid();
    }
}
