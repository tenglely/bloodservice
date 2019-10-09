package com.blood.bloodservice.service;

import com.blood.bloodservice.entity.Doctor;

import java.util.List;

/**
 * 医护人员注册
 * @author zyqfz
 * @date 2019/9/27 - 15:09
 */
public interface DoctorService {
    //添加医护人员信息
    int addDoctor(Doctor doctor);

    //添加根据角色信息
    void addRoot(int did);

    /**
     * 根据did查找一个doctor信息
     * @param did
     * @return
     */
    Doctor selectbydid(int did);


    //查询医护人员信息
      List<Doctor> selectDoctor();
}
