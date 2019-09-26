package com.blood.bloodservice.dao;

import com.blood.bloodservice.entity.Bloodaddress;
import com.blood.bloodservice.entity.BloodaddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BloodaddressMapper {
    int countByExample(BloodaddressExample example);

    int deleteByExample(BloodaddressExample example);

    int deleteByPrimaryKey(Integer bid);

    int insert(Bloodaddress record);

    int insertSelective(Bloodaddress record);

    List<Bloodaddress> selectByExample(BloodaddressExample example);

    Bloodaddress selectByPrimaryKey(Integer bid);

    int updateByExampleSelective(@Param("record") Bloodaddress record, @Param("example") BloodaddressExample example);

    int updateByExample(@Param("record") Bloodaddress record, @Param("example") BloodaddressExample example);

    int updateByPrimaryKeySelective(Bloodaddress record);

    int updateByPrimaryKey(Bloodaddress record);
}