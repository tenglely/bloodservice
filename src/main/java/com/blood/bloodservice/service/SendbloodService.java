package com.blood.bloodservice.service;

import com.blood.bloodservice.entity.Sendblood;

import java.util.List;

/**
 * 献血记录
 * @author zyqfz
 * @date 2019/9/26 - 17:32
 */
public interface SendbloodService {

    //添加献血记录
    int addSendBlood(Sendblood sendblood);

    /**
     * 查询所有献血记录
     * @return
     */
    List<Sendblood> selectall();

    /**
     * 医务人员根据yid查找自己添加的献血记录
     * @param yid
     * @return
     */
    List<Sendblood> selectbyyid(Integer yid);

    /**
     * 用户根据uid查询自己的献血记录
     * @param uid
     * @return
     */
    List<Sendblood> selectbyuid(Integer uid);


}
