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

    //根据申请id查询申请详细信息
    Application selectOneApplication(Integer aid);

    //根据申请状态查询申请列表
    List<Application> selectApplicationBystate(Integer state);
}
