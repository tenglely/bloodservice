package com.blood.bloodservice.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blood.bloodservice.entity.Bloodaddress;
import com.blood.bloodservice.entity.Msg;
import com.blood.bloodservice.service.impl.BloodaddressServiceImpl;

@Api(tags = "献血地址信息")
@RestController
public class BloodAddressController {
	
	@Autowired
	BloodaddressServiceImpl bloodaddressServiceImpl;
	@ApiOperation(value = "添加献血地址信息")
	@RequestMapping("/doctor/addBloodAddress")
	public Msg addBloodAddress(Bloodaddress bloodaddress) {

		bloodaddress.setBstate(false);
		bloodaddressServiceImpl.addBloodaddressd(bloodaddress);
		return Msg.success();
		
	}
}
