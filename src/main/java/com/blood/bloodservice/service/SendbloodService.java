package com.blood.bloodservice.service;

import com.blood.bloodservice.entity.Doctor;
import com.blood.bloodservice.entity.People;
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

    /**
     * 根据献血记录编号bid查找一条
     * @param bid
     * @return
     */
    Sendblood selectonbybid(Integer bid);

    //发送邮件
    void sendEmail(Sendblood sendblood, People people, Doctor doctor);
}
