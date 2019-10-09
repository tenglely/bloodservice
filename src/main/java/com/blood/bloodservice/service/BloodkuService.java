package com.blood.bloodservice.service;

import com.blood.bloodservice.entity.Bloodku;

import java.util.List;

/**
 * 血库记录
 * @author zyqfz
 * @date 2019/9/26 - 23:23
 */
public interface BloodkuService {

    //添加血库信息
    int addBloodku(Bloodku bloodku );

    /**
     * 查血库全部
     * @return
     */
    public List<Bloodku> selectall();
}
