package com.blood.bloodservice.service;

import com.blood.bloodservice.entity.Cblood;

import java.util.List;

/**
 *
 * 抽血通知服务
 * @author zyqfz
 * @date 2019/9/26 - 15:24
 */
public interface CbloodService {

    //添加献血通知表
    int addCblood(Cblood cblood);

    /**
     * 根据cid查询一条
     * @param cid
     * @return
     */
    Cblood findbycid(int cid);

    /**
     * 查询所有活动中,未过期的cblood，降序
     * @return
     */
    List<Cblood> selectall();

    /**
     * 查询所有活动
     * @return
     */
    List<Cblood> findallcblood();

    /**
     * 根据地址查询
     * @param did
     * @return
     */
    List<Cblood> findbyaddress(int did);

    /**
     * 修改活动状态为开启
     * @param pn
     * @return
     */
    int updatecstate(Integer cid);
}
