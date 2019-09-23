package com.blood.bloodservice.dao;

import com.blood.bloodservice.entity.Checkresult;
import com.blood.bloodservice.entity.CheckresultExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CheckresultMapper {
    int countByExample(CheckresultExample example);

    int deleteByExample(CheckresultExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Checkresult record);

    int insertSelective(Checkresult record);

    List<Checkresult> selectByExample(CheckresultExample example);

    Checkresult selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Checkresult record, @Param("example") CheckresultExample example);

    int updateByExample(@Param("record") Checkresult record, @Param("example") CheckresultExample example);

    int updateByPrimaryKeySelective(Checkresult record);

    int updateByPrimaryKey(Checkresult record);
}