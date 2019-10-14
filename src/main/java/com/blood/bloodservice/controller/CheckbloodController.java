package com.blood.bloodservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blood.bloodservice.entity.Checkblood;
import com.blood.bloodservice.entity.Msg;
import com.blood.bloodservice.service.impl.CheckbloodServiceImpl;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 
 * @author HuangYuhan
 *
 */
@Api(tags="献血预约")
@RestController
public class CheckbloodController {
	
	@Autowired
	CheckbloodServiceImpl checkbloodServiceImpl;
	
	@ApiOperation(value="添加献血预约")
	@PostMapping("/doctor/addcheckblood")
	public Msg addCheckBlood(Checkblood checkblood) {
		checkbloodServiceImpl.addCheckblood(checkblood);
		return Msg.success();
		
	}
}
