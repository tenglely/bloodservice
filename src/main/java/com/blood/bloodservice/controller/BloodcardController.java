package com.blood.bloodservice.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blood.bloodservice.entity.Bloodcard;
import com.blood.bloodservice.entity.Doctor;
import com.blood.bloodservice.entity.Msg;
import com.blood.bloodservice.entity.Userlogin;
import com.blood.bloodservice.service.impl.BloodcardServiceImpl;
import com.blood.bloodservice.service.impl.DoctorServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 
 * @author HuangYuhan
 *
 */
@Api(tags="献血证信息")
@RestController
public class BloodcardController {
	
	@Autowired
	BloodcardServiceImpl bloodcardServiceImpl;
	@Autowired
	DoctorServiceImpl doctorServiceImpl;
	
	@ApiOperation(value="添加献血证信息")
	@PostMapping("/doctor/addbloodcard/{uid}")
	public Msg addBloodcard(@PathVariable("uid")Integer uid) {
		Bloodcard bloodcard = new Bloodcard();
		
		Userlogin userlogin= (Userlogin) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		Doctor doctor=doctorServiceImpl.selectbydid(userlogin.getUid());
		bloodcard.setSendaddress(doctor.getDwork());
		Date currentTime = new Date();
	    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	    String dateString = formatter.format(currentTime);
	    
	    bloodcard.setUid(uid);
	    bloodcard.setSenddate(dateString);
	    bloodcard.setState(true);
	    
		return Msg.success();
	}
	
	@ApiOperation(value="查询全部献血证")
	@GetMapping("/doctor/selectbloodcard/{pn}")
	public Msg selectBloodcard(@PathVariable("pn")Integer pn) {
		PageHelper.startPage(pn, 10);
		List<Bloodcard> list = bloodcardServiceImpl.selectBloodcards();
		PageInfo pageInfo = new PageInfo(list, 5);
		return Msg.success().add("list", pageInfo);
		
	}
}
