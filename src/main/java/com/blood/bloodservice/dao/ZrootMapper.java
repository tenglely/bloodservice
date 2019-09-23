package com.blood.bloodservice.dao;

import com.blood.bloodservice.entity.Zroot;
import com.blood.bloodservice.entity.ZrootExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZrootMapper {
    int countByExample(ZrootExample example);

    int deleteByExample(ZrootExample example);

    int deleteByPrimaryKey(Integer gid);

    int insert(Zroot record);

    int insertSelective(Zroot record);

    List<Zroot> selectByExample(ZrootExample example);

    Zroot selectByPrimaryKey(Integer gid);

    int updateByExampleSelective(@Param("record") Zroot record, @Param("example") ZrootExample example);

    int updateByExample(@Param("record") Zroot record, @Param("example") ZrootExample example);

    int updateByPrimaryKeySelective(Zroot record);

    int updateByPrimaryKey(Zroot record);
}