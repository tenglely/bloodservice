package com.blood.bloodservice.service.impl;

import com.blood.bloodservice.dao.DoctorMapper;
import com.blood.bloodservice.dao.UserloginMapper;
import com.blood.bloodservice.entity.Doctor;
import com.blood.bloodservice.entity.DoctorExample;
import com.blood.bloodservice.entity.UserRole;
import com.blood.bloodservice.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zyqfz
 * @date 2019/9/27 - 15:12
 */
@Service
public class DoctorServiceImpl implements DoctorService {
    @Autowired
    DoctorMapper doctorMapper;

    @Autowired
    private UserloginMapper userloginMapper;
    @Override
    public int addDoctor(Doctor doctor) {

        doctorMapper.insert(doctor);
        return doctor.getDid();

    }



    //添加献血人员角色表
    public void addRoot(int did){

        for(int i=2;i<=3;i++) {
            UserRole userRole = new UserRole();
            userRole.setUid(did);
            userRole.setRid(i);
            userloginMapper.insertUserRole(userRole);

        }
    }

    //查询医护人员信息
    @Override
    public List<Doctor> selectDoctor() {

        DoctorExample example = new DoctorExample();
        List<Doctor> doctorlist = doctorMapper.selectByExample(example);
        return doctorlist;
    }



}
