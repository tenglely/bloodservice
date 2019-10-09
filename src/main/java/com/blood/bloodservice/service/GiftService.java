package com.blood.bloodservice.service;

import com.blood.bloodservice.entity.Gift;

import java.util.List;

/**
 * 物资服务
 * @author zyqfz
 * @date 2019/9/26 - 15:55
 */
public interface GiftService {

    //添加礼品
    int addGift(Gift gift);

    //查看所有礼品
    List<Gift> selectGift();

    /**
     * 根据lid查询物资信息
     * @param lid
     * @return
     */
    List<Gift> selectbylid(Integer lid);
}
