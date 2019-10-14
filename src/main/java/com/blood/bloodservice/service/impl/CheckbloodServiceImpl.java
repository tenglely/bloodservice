package com.blood.bloodservice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blood.bloodservice.dao.CheckbloodMapper;
import com.blood.bloodservice.entity.Checkblood;
import com.blood.bloodservice.service.CheckbloodService;
/**
 * 	献血预约业务
 * @author HuangYuhan
 *
 */
@Service
public class CheckbloodServiceImpl implements CheckbloodService {

	@Autowired
	CheckbloodMapper checkbloodMapper;
	//添加献血预约
	@Override
	public int addCheckblood(Checkblood checkblood) {
		int index = checkbloodMapper.insert(checkblood);
		if(index>0) {
			return checkblood.getId();
		}else {
			return 0;
		}
	}

}
