package com.blood.bloodservice.dao;

import com.blood.bloodservice.entity.Useblood;
import com.blood.bloodservice.entity.UsebloodExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsebloodMapper {
    int countByExample(UsebloodExample example);

    int deleteByExample(UsebloodExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Useblood record);

    int insertSelective(Useblood record);

    List<Useblood> selectByExample(UsebloodExample example);

    Useblood selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Useblood record, @Param("example") UsebloodExample example);

    int updateByExample(@Param("record") Useblood record, @Param("example") UsebloodExample example);

    int updateByPrimaryKeySelective(Useblood record);

    int updateByPrimaryKey(Useblood record);
}