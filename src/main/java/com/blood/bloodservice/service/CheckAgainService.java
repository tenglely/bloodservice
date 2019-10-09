package com.blood.bloodservice.service;

import com.blood.bloodservice.entity.Checkagain;

import java.util.List;

/**
 * 血液二次复检
 * @author zyqfz
 * @date 2019/9/26 - 23:47
 */
public interface CheckAgainService {
    int addCheckAgain(Checkagain checkagain);

    //查询所有复检结果
    List<Checkagain> selectCheckagain();
}
