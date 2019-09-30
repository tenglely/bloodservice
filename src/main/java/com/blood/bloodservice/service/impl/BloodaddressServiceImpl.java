package com.blood.bloodservice.service.impl;

import com.blood.bloodservice.entity.BloodaddressExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blood.bloodservice.dao.BloodaddressMapper;
import com.blood.bloodservice.entity.Bloodaddress;
import com.blood.bloodservice.service.BloodaddressService;

import java.util.List;

@Service
public class BloodaddressServiceImpl implements BloodaddressService {

	@Autowired
	BloodaddressMapper bloodaddressMapper;

	@Override
	public int addBloodaddressd(Bloodaddress bloodaddress) {
		int id = bloodaddressMapper.insert(bloodaddress);
		if (id > 0)
			return bloodaddress.getBid();
		else return 0;
	}

	//查询献血地址列表,状态为在使用
	@Override
	public List<Bloodaddress> selectBloodaddress() {
		BloodaddressExample example = new BloodaddressExample();
		BloodaddressExample.Criteria criteria = example.createCriteria();
		criteria.andBstateEqualTo(true);
		List<Bloodaddress> list = bloodaddressMapper.selectByExample(example);
		if (list != null)
			return list;
		else
			return null;
	}

	//查询所有地址
	@Override
	public List<Bloodaddress> selectAllBloodaddress() {
		List<Bloodaddress> list = bloodaddressMapper.selectByExample(null);
		if(list!=null)
			return list;
		else
			return null;
	}

	@Override
	public Bloodaddress selectbyaddress(String address) {
		BloodaddressExample bloodaddressExample = new BloodaddressExample();
		BloodaddressExample.Criteria criteria = bloodaddressExample.createCriteria();
		criteria.andBaddressEqualTo(address);
		List<Bloodaddress> lsit = bloodaddressMapper.selectByExample(bloodaddressExample);
		if (lsit.isEmpty())
			return null;
		return lsit.get(0);
	}

}

