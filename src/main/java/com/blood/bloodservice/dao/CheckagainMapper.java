package com.blood.bloodservice.dao;

import com.blood.bloodservice.entity.Checkagain;
import com.blood.bloodservice.entity.CheckagainExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CheckagainMapper {
    int countByExample(CheckagainExample example);

    int deleteByExample(CheckagainExample example);

    int deleteByPrimaryKey(Integer cid);

    int insert(Checkagain record);

    int insertSelective(Checkagain record);

    List<Checkagain> selectByExample(CheckagainExample example);

    Checkagain selectByPrimaryKey(Integer cid);

    int updateByExampleSelective(@Param("record") Checkagain record, @Param("example") CheckagainExample example);

    int updateByExample(@Param("record") Checkagain record, @Param("example") CheckagainExample example);

    int updateByPrimaryKeySelective(Checkagain record);

    int updateByPrimaryKey(Checkagain record);
}