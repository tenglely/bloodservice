package com.blood.bloodservice.service;

import com.blood.bloodservice.entity.Register;

import java.util.List;

/**
 * 登记信息表接口
 */
public interface RegisterService {

    int addRegister(int uid,int bid);

    /**
     * 根据日期查询登记信息及用户信息
     * @param rdate
     * @return
     */
    List<Register> selectbydate(String rdate,int bid);

    /**
     * 根据年+月份查询登记信息及用户信息
     * @param rdate
     * @return
     */
    List<Register> selectbymonth(String rdate,int bid);
}
