package com.blood.bloodservice.dao;

import com.blood.bloodservice.entity.Checkbook;
import com.blood.bloodservice.entity.CheckbookExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CheckbookMapper {
    int countByExample(CheckbookExample example);

    int deleteByExample(CheckbookExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Checkbook record);

    int insertSelective(Checkbook record);

    List<Checkbook> selectByExample(CheckbookExample example);

    Checkbook selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Checkbook record, @Param("example") CheckbookExample example);

    int updateByExample(@Param("record") Checkbook record, @Param("example") CheckbookExample example);

    int updateByPrimaryKeySelective(Checkbook record);

    int updateByPrimaryKey(Checkbook record);
}