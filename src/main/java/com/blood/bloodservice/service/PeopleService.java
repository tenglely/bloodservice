package com.blood.bloodservice.service;

import com.blood.bloodservice.entity.People;

import java.util.List;

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

    /**
     * 根据uid查找出一条用户信息
     * @param uid
     * @return
     */
    People selectonebyid(Integer uid);

    /**
     * 根据身份证查询用户信息
     * @param uidentity
     * @return
     */
    People selectbyidenty(String uidentity);

    /**
     * 查找全部用户
     * @return
     */
    List<People> selectall();
}

