package com.blood.bloodservice.service.impl;

import com.blood.bloodservice.dao.ApplicationMapper;
import com.blood.bloodservice.entity.Application;
import com.blood.bloodservice.entity.ApplicationExample;
import com.blood.bloodservice.service.ApplicationService;
import com.sun.org.apache.xml.internal.security.encryption.CipherReference;
import javafx.scene.shape.Circle;
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

    //查询所有申请信息,联合表doctor
    @Override
    public List<Application> selectAllapplication() {
        List<Application> list = applicationMapper.selectApplication();
        if(list.isEmpty())
            return null;
        else
            return list;
    }

    //根据申请id查询申请详细信息
    @Override
    public Application selectOneApplication(Integer aid) {
        Application application= applicationMapper.selectByPrimaryKey(aid);
        if(application==null)
            return null;
        else
            return application;
    }

    //根据申请状态查询申请列表
    @Override
    public List<Application> selectApplicationBystate(Integer state) {
        ApplicationExample applicationExample = new ApplicationExample();
        ApplicationExample.Criteria criteria = applicationExample.createCriteria();
        criteria.andStateEqualTo(state);
        List<Application> list = applicationMapper.selectByExample(applicationExample);
        if(list.isEmpty())
            return null;
        else
            return list;
    }
}
