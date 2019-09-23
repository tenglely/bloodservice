package com.blood.bloodservice.dao;

import com.blood.bloodservice.entity.Blood;
import com.blood.bloodservice.entity.BloodExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BloodMapper {
    int countByExample(BloodExample example);

    int deleteByExample(BloodExample example);

    int deleteByPrimaryKey(Integer bid);

    int insert(Blood record);

    int insertSelective(Blood record);

    List<Blood> selectByExample(BloodExample example);

    Blood selectByPrimaryKey(Integer bid);

    int updateByExampleSelective(@Param("record") Blood record, @Param("example") BloodExample example);

    int updateByExample(@Param("record") Blood record, @Param("example") BloodExample example);

    int updateByPrimaryKeySelective(Blood record);

    int updateByPrimaryKey(Blood record);
}