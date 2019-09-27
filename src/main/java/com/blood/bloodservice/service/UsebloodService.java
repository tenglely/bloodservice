package com.blood.bloodservice.service;

import com.blood.bloodservice.entity.Useblood;

/**
 * 血液使用情况表
 * @author zyqfz
 * @date 2019/9/27 - 8:20
 */
public interface UsebloodService {

    //添加血液使用信息
    int addUseblood(Useblood useblood);
}
