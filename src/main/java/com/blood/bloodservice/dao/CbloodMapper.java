package com.blood.bloodservice.dao;

import com.blood.bloodservice.entity.Cblood;
import com.blood.bloodservice.entity.CbloodExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CbloodMapper {
    int countByExample(CbloodExample example);

    int deleteByExample(CbloodExample example);

    int deleteByPrimaryKey(Integer cid);

    int insert(Cblood record);

    int insertSelective(Cblood record);

    List<Cblood> selectByExampleWithUser(CbloodExample example);

    Cblood selectByPrimaryKeyWithUser(Integer cid);

    List<Cblood> selectByExample(CbloodExample example);

    Cblood selectByPrimaryKey(Integer cid);

    int updateByExampleSelective(@Param("record") Cblood record, @Param("example") CbloodExample example);

    int updateByExample(@Param("record") Cblood record, @Param("example") CbloodExample example);

    int updateByPrimaryKeySelective(Cblood record);

    int updateByPrimaryKey(Cblood record);
}