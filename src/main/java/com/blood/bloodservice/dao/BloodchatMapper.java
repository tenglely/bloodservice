package com.blood.bloodservice.dao;

import com.blood.bloodservice.entity.Bloodchat;
import com.blood.bloodservice.entity.BloodchatExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BloodchatMapper {
    int countByExample(BloodchatExample example);

    int deleteByExample(BloodchatExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Bloodchat record);

    int insertSelective(Bloodchat record);

    List<Bloodchat> selectByExample(BloodchatExample example);

    Bloodchat selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Bloodchat record, @Param("example") BloodchatExample example);

    int updateByExample(@Param("record") Bloodchat record, @Param("example") BloodchatExample example);

    int updateByPrimaryKeySelective(Bloodchat record);

    int updateByPrimaryKey(Bloodchat record);
}