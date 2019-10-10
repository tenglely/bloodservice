package com.blood.bloodservice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blood.bloodservice.dao.BloodcardMapper;
import com.blood.bloodservice.entity.Bloodcard;
import com.blood.bloodservice.service.BloodcardService;
@Service
public class BloodcardServiceImpl implements BloodcardService{
	
	@Autowired
	private BloodcardMapper bloodcardMapper;
	
	@Override
	public int addBloodcard(Bloodcard bloodcard) {
		
		int id = bloodcardMapper.insert(bloodcard);
		if(id>0) {
			return bloodcard.getId();
		}else {
			return 0;
		}
	}

}
