package com.blood.bloodservice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blood.bloodservice.dao.BloodaddressMapper;
import com.blood.bloodservice.entity.Bloodaddress;
import com.blood.bloodservice.service.BloodaddressService;

@Service
public class BloodaddressServiceImpl implements BloodaddressService{

	@Autowired
	BloodaddressMapper bloodaddressMapper;
	
	@Override
	public int addBloodaddressd(Bloodaddress bloodaddress) {
		int id = bloodaddressMapper.insert(bloodaddress);
		return bloodaddress.getBid();
	}

}
