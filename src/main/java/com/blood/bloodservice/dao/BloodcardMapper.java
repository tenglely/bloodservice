package com.blood.bloodservice.dao;

import com.blood.bloodservice.entity.Bloodcard;
import com.blood.bloodservice.entity.BloodcardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BloodcardMapper {
    int countByExample(BloodcardExample example);

    int deleteByExample(BloodcardExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Bloodcard record);

    int insertSelective(Bloodcard record);

    List<Bloodcard> selectByExampleWithUser(BloodcardExample example);

    List<Bloodcard> selectByExample(BloodcardExample example);

    Bloodcard selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Bloodcard record, @Param("example") BloodcardExample example);

    int updateByExample(@Param("record") Bloodcard record, @Param("example") BloodcardExample example);

    int updateByPrimaryKeySelective(Bloodcard record);

    int updateByPrimaryKey(Bloodcard record);
}