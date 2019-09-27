package com.blood.bloodservice.service;

import com.blood.bloodservice.entity.Cblood;

/**
 *
 * 抽血通知服务
 * @author zyqfz
 * @date 2019/9/26 - 15:24
 */
public interface CbloodService {

    //添加献血通知表
    int addCblood(Cblood cblood);
}
