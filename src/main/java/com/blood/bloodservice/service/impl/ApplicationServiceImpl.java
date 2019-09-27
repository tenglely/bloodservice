package com.blood.bloodservice.service.impl;

import com.blood.bloodservice.dao.ApplicationMapper;
import com.blood.bloodservice.entity.Application;
import com.blood.bloodservice.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zyqfz
 * @date 2019/9/27 - 0:12
 */
@Service
public class ApplicationServiceImpl implements ApplicationService {
    @Autowired
    ApplicationMapper applicationMapper;

    @Override
    public int addApplication(Application application) {
        applicationMapper.insert(application);
        return application.getAid();
    }
}
