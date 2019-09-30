package com.blood.bloodservice.dao;

import com.blood.bloodservice.entity.Register;
import com.blood.bloodservice.entity.RegisterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RegisterMapper {

    int countByExample(RegisterExample example);

    int deleteByExample(RegisterExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Register record);

    int insertSelective(Register record);

    List<Register> selectByExampleWithUser(RegisterExample example);

    Register selectByPrimaryKeyWithUser(Integer cid);

    List<Register> selectByExample(RegisterExample example);

    Register selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Register record, @Param("example") RegisterExample example);

    int updateByExample(@Param("record") Register record, @Param("example") RegisterExample example);

    int updateByPrimaryKeySelective(Register record);

    int updateByPrimaryKey(Register record);
}