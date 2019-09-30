package com.blood.bloodservice.service.impl;

import com.blood.bloodservice.dao.ApplicationMapper;
import com.blood.bloodservice.entity.Application;
import com.blood.bloodservice.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
        int id = applicationMapper.insert(application);
        if(id!=0){
        return application.getAid();
        }
        return 0;
    }

    //查询所有申请信息
    @Override
    public List<Application> selectAllapplication() {
        List<Application> list = applicationMapper.selectApplication();
        if(list!=null)
            return list;
        else
            return null;
    }
}
