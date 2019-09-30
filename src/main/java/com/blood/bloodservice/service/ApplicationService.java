package com.blood.bloodservice.service;

import com.blood.bloodservice.entity.Application;

import java.util.List;

/**
 * 血液申请application
 * @author zyqfz
 * @date 2019/9/27 - 0:10
 */
public interface ApplicationService {

    //填写申请信息
    int addApplication(Application application);

    //查询所有申请信息列表
    List<Application> selectAllapplication();
}
