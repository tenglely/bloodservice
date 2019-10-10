package com.blood.bloodservice.service.impl;

import com.blood.bloodservice.dao.BloodkuMapper;
import com.blood.bloodservice.entity.Bloodku;
import com.blood.bloodservice.entity.BloodkuExample;
import com.blood.bloodservice.entity.BloodkuExample.Criteria;
import com.blood.bloodservice.service.BloodkuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 血库添加
 * @author zyqfz
 * @date 2019/9/26 - 23:26
 */
@Service
public class BloodkuServiceImpl implements BloodkuService {
    @Autowired
    BloodkuMapper bloodkuMapper;
    @Override
    public int addBloodku(Bloodku bloodku) {
        bloodkuMapper.insert(bloodku);
        return bloodku.getBid();
    }

    @Override
    public List<Bloodku> selectall() {
        //BloodkuExample bloodkuExample=new BloodkuExample();
        //BloodkuExample.Criteria criteria=bloodkuExample.createCriteria();

        List<Bloodku> list=bloodkuMapper.selectByExample(null);
        if(list.isEmpty())
            return null;
        else
            return  list;
    }
    
    /**
     * 根据血型查询血库信息
     */
	@Override
	public List<Bloodku> selectByBtype(String btype) {
		BloodkuExample bloodkuExample = new BloodkuExample();
		BloodkuExample.Criteria criteria = bloodkuExample.createCriteria();
		criteria.andBtypeEqualTo(btype);
		List<Bloodku> list = bloodkuMapper.selectByExample(bloodkuExample);
		if(list.isEmpty()) {
			return null;
		}else {
			return list;
		}
	}
	
	/**
	 * 根据地址查询血库信息
	 */
	@Override
	public List<Bloodku> selectByBaddress(Integer BaddressId) {
		BloodkuExample bloodkuExample = new BloodkuExample();
		BloodkuExample.Criteria criteria = bloodkuExample.createCriteria();
		criteria.andBaddressidEqualTo(BaddressId);
		List<Bloodku> list = bloodkuMapper.selectByExample(bloodkuExample);
		if(list.isEmpty()) {
			return null;
		}else {
			return list;
		}
	}

	/**
	 * 根据使用状态查询血库信息
	 */
	@Override
	public List<Bloodku> selectByState(Boolean state) {
		BloodkuExample bloodkuExample = new BloodkuExample();
		BloodkuExample.Criteria criteria = bloodkuExample.createCriteria();
		criteria.andStateEqualTo(state);
		List<Bloodku> list = bloodkuMapper.selectByExample(bloodkuExample);
		if(list.isEmpty()) {
			return null;
		}else {
			return list;
		}
	}

}
