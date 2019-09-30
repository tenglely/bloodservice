package com.blood.bloodservice.service;

import com.blood.bloodservice.entity.Btarget;
import com.blood.bloodservice.entity.Register;

import java.util.List;

/**
 * 检测指标
 * @author zyqfz
 * @date 2019/9/26 - 23:59
 */
public interface BtargetService {

    int addBtarget(Btarget btarget);

    List<Btarget> selectBtarget();

}
