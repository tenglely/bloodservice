package com.blood.bloodservice.service;

import com.blood.bloodservice.entity.People;

/**
 * 医护人员添加献血人员登记业务
 * @author zyqfz
 * @date 2019/9/25 - 9:06
 */

public interface PeopleService {
    //医护人员添加献血人员登记业务
    public int addPeople(People people);


    //添加给献血人员添加权限
    public void addRoot(Integer uid);

}

