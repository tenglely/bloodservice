package com.blood.bloodservice.service;

import com.blood.bloodservice.entity.Useblood;

import java.util.List;

/**
 * 血液使用情况表
 * @author zyqfz
 * @date 2019/9/27 - 8:20
 */
public interface UsebloodService {

    //添加血液使用信息
    int addUseblood(Useblood useblood);

    //查询血液使用情况列表
    List<Useblood> selectAllUseblood();

    //根据使用血液id查询详细使用情况
    Useblood selectOneUseblood(Integer id);

    //根据血液领取状态查询血液使用列表
    List<Useblood> selectUsebloodBystate(Boolean state);

}
