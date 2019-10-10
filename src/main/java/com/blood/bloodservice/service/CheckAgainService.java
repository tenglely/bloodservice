package com.blood.bloodservice.service;

import com.blood.bloodservice.entity.Checkagain;

import java.util.List;

/**
 * 血液二次复检
 * @author zyqfz
 * @date 2019/9/26 - 23:47
 */
public interface CheckAgainService {

    //添加复检结果
    int addCheckAgain(Checkagain checkagain);

    //查询所有复检结果
    List<Checkagain> selectCheckagain();

    //根据复检结果cid查询复检结果详细信息
    Checkagain selectOnecheckagain(Integer cid);
    //根据复检结果状态查询所有复检结果
    List<Checkagain> selectCheckagainBycstate(Boolean cstate);

}
