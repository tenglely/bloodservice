package com.blood.bloodservice.dao;

import com.blood.bloodservice.entity.Btarget;
import com.blood.bloodservice.entity.BtargetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BtargetMapper {
    int countByExample(BtargetExample example);

    int deleteByExample(BtargetExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Btarget record);

    int insertSelective(Btarget record);

    List<Btarget> selectByExample(BtargetExample example);

    Btarget selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Btarget record, @Param("example") BtargetExample example);

    int updateByExample(@Param("record") Btarget record, @Param("example") BtargetExample example);

    int updateByPrimaryKeySelective(Btarget record);

    int updateByPrimaryKey(Btarget record);
}