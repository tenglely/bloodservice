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
    
    /**
     * 根据血型查询血库信息
     * @return
     */
    public List<Bloodku> selectByBtype(String btype);
    
    /**
     * 根据地址查询血库信息
     */
    public List<Bloodku> selectByBaddress(Integer BaddressId);
    
    /**
     * 根据使用状态查询血库信息
     */
    public List<Bloodku> selectByState(Boolean state);
}
