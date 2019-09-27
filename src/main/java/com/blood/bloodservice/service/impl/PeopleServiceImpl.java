package com.blood.bloodservice.service.impl;

import com.blood.bloodservice.dao.PeopleMapper;
import com.blood.bloodservice.dao.UserloginMapper;
import com.blood.bloodservice.entity.People;
import com.blood.bloodservice.entity.PeopleExample;
import com.blood.bloodservice.entity.UserRole;
import com.blood.bloodservice.entity.Userlogin;
import com.blood.bloodservice.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 医护人员添加献血人员登记业务
 * @author zyqfz
 * @date 2019/9/26 - 11:15
 */
//医护人员添加献血人员登记业务
@Service
public class PeopleServiceImpl implements PeopleService {


    @Autowired
    PeopleMapper peopleMapper;

    @Autowired
    UserloginMapper userloginMapper;

    //添加献血人员
    @Override
    public int addPeople(People people) {

       // PeopleExample example = new PeopleExample();
       // PeopleExample.Criteria criteria = example.createCriteria();
        //返回添加献血人员的主键uid
        peopleMapper.insert(people);
        return people.getUid();
    }

    //添加献血人员角色表
    public void addRoot(Integer uid){
        UserRole userRole = new UserRole();
        userRole.setUid(uid);
        userRole.setRid(3);
        userloginMapper.insertUserRole(userRole);

    }

    @Override
    public People selectonebyid(Integer uid) {
        return peopleMapper.selectByPrimaryKey(uid);
    }
}
