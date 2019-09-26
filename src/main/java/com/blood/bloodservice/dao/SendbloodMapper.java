package com.blood.bloodservice.dao;

import com.blood.bloodservice.entity.Sendblood;
import com.blood.bloodservice.entity.SendbloodExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SendbloodMapper {
    int countByExample(SendbloodExample example);

    int deleteByExample(SendbloodExample example);

    int deleteByPrimaryKey(Integer bid);

    int insert(Sendblood record);

    int insertSelective(Sendblood record);

    List<Sendblood> selectByExample(SendbloodExample example);

    Sendblood selectByPrimaryKey(Integer bid);

    int updateByExampleSelective(@Param("record") Sendblood record, @Param("example") SendbloodExample example);

    int updateByExample(@Param("record") Sendblood record, @Param("example") SendbloodExample example);

    int updateByPrimaryKeySelective(Sendblood record);

    int updateByPrimaryKey(Sendblood record);
}