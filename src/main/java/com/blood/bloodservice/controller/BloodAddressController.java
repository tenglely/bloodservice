package com.blood.bloodservice.controller;

import com.blood.bloodservice.entity.*;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.blood.bloodservice.service.impl.BloodaddressServiceImpl;

import javax.websocket.server.PathParam;
import java.util.List;

@Api(tags = "献血地址信息")
@RestController
public class BloodAddressController {
	
	@Autowired
	BloodaddressServiceImpl bloodaddressServiceImpl;
	@ApiOperation(value = "添加献血地址信息")
	@PostMapping("/doctor/addBloodAddress")
	public Msg addBloodAddress(Bloodaddress bloodaddress) {

		bloodaddress.setBstate(true);
		bloodaddressServiceImpl.addBloodaddressd(bloodaddress);
		return Msg.success();
		
	}

	@ApiOperation(value = "查询可用献血地址信息")
	@PostMapping("/doctor/selectBloodAddress")
	public Msg selectBloodAddress() {
		//获取医护人员登录信息
		Userlogin userlogin= (Userlogin) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		//查询可用地址列表
		List<Bloodaddress> addresslist = bloodaddressServiceImpl.selectBloodaddress();
		return Msg.success().add("address",addresslist).add("did",userlogin.getUid());
	}

	@ApiOperation(value = "查询所有献血地址信息,分页显示一页10条数据")
	@PostMapping("/doctor/selectAllBloodAddress/{pn}")
	public Msg selectAllBloodAddress(@PathParam("pn") Integer pn) {
		//查询地址列表
		PageHelper.startPage(pn,10);
		List<Bloodaddress> addresslist = bloodaddressServiceImpl.selectAllBloodaddress();
		PageInfo pageInfo = new PageInfo(addresslist,5);
		return Msg.success().add("pageinfo",pageInfo);
	}
}
