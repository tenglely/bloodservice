package com.blood.bloodservice.service;

import java.util.List;

import com.blood.bloodservice.entity.Bloodcard;

/**
 * 献血证业务
 * @author HuangYuhan
 *
 */
public interface BloodcardService {
	//添加献血证
	int addBloodcard(Bloodcard bloodcard);
	
	//查询献血证全部
	List<Bloodcard> selectBloodcards();
}
