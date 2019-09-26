package com.blood.bloodservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blood.bloodservice.entity.Bloodaddress;
import com.blood.bloodservice.entity.Msg;
import com.blood.bloodservice.service.impl.BloodaddressServiceImpl;

@RestController
public class BloodAddressController {
	
	@Autowired
	BloodaddressServiceImpl bloodaddressServiceImpl;
	
	@RequestMapping("/doctor/addBloodAddress")
	public Msg addBloodAddress(Bloodaddress bloodaddress) {
		
		bloodaddressServiceImpl.addBloodaddressd(bloodaddress);
		return Msg.success();
		
	}
}
