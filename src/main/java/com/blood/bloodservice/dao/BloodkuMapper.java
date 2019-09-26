package com.blood.bloodservice.dao;

import com.blood.bloodservice.entity.Bloodku;
import com.blood.bloodservice.entity.BloodkuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BloodkuMapper {
    int countByExample(BloodkuExample example);

    int deleteByExample(BloodkuExample example);

    int deleteByPrimaryKey(Integer bid);

    int insert(Bloodku record);

    int insertSelective(Bloodku record);

    List<Bloodku> selectByExample(BloodkuExample example);

    Bloodku selectByPrimaryKey(Integer bid);

    int updateByExampleSelective(@Param("record") Bloodku record, @Param("example") BloodkuExample example);

    int updateByExample(@Param("record") Bloodku record, @Param("example") BloodkuExample example);

    int updateByPrimaryKeySelective(Bloodku record);

    int updateByPrimaryKey(Bloodku record);
}