package com.blood.bloodservice.dao;

import com.blood.bloodservice.entity.Role;
import com.blood.bloodservice.entity.UserRole;
import com.blood.bloodservice.entity.Userlogin;
import com.blood.bloodservice.entity.UserloginExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserloginMapper {

    int insertUserRole(UserRole userRole);

    Userlogin loadUserByUsername(@Param("uemail") String uemail,@Param("utype") String utype);

    List<Role> getUserRolesByUid(Integer id);

    int countByExample(UserloginExample example);

    int deleteByExample(UserloginExample example);

    int deleteByPrimaryKey(Integer did);

    int insert(Userlogin record);

    int insertSelective(Userlogin record);

    List<Userlogin> selectByExample(UserloginExample example);

    Userlogin selectByPrimaryKey(Integer did);

    int updateByExampleSelective(@Param("record") Userlogin record, @Param("example") UserloginExample example);

    int updateByExample(@Param("record") Userlogin record, @Param("example") UserloginExample example);

    int updateByPrimaryKeySelective(Userlogin record);

    int updateByPrimaryKey(Userlogin record);
}