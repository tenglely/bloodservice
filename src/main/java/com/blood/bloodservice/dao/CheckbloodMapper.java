package com.blood.bloodservice.dao;

import com.blood.bloodservice.entity.Checkblood;
import com.blood.bloodservice.entity.CheckbloodExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CheckbloodMapper {
    int countByExample(CheckbloodExample example);

    int deleteByExample(CheckbloodExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Checkblood record);

    int insertSelective(Checkblood record);

    List<Checkblood> selectByExample(CheckbloodExample example);

    Checkblood selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Checkblood record, @Param("example") CheckbloodExample example);

    int updateByExample(@Param("record") Checkblood record, @Param("example") CheckbloodExample example);

    int updateByPrimaryKeySelective(Checkblood record);

    int updateByPrimaryKey(Checkblood record);
}