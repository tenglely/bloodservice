package com.blood.bloodservice.service;

import com.blood.bloodservice.entity.Bloodaddress;

import java.util.List;

/**
 * 抽血地点业务
 * @author HuangYuhan
 *
 */
public interface BloodaddressService {
	
	//添加抽血点地址
	int addBloodaddressd(Bloodaddress bloodaddress);

	//查询可用献血地址
	List<Bloodaddress> selectBloodaddress();

	//查询所有地址
	List<Bloodaddress> selectAllBloodaddress();
	
}
