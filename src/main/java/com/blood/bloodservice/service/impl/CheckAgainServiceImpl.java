package com.blood.bloodservice.service.impl;

import com.blood.bloodservice.dao.CheckagainMapper;
import com.blood.bloodservice.entity.Checkagain;
import com.blood.bloodservice.service.CheckAgainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**\
 * 二次检测结果
 * @author zyqfz
 * @date 2019/9/26 - 23:51
 */
@Service
public class CheckAgainServiceImpl implements CheckAgainService {
    @Autowired
    CheckagainMapper checkagainMapper;
    @Override
    public int addCheckAgain(Checkagain checkagain) {
        checkagainMapper.insert(checkagain);
        return checkagain.getCid();
    }
}
