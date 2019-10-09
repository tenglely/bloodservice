package com.blood.bloodservice.service.impl;



import com.blood.bloodservice.dao.GiftMapper;
import com.blood.bloodservice.entity.Gift;
import com.blood.bloodservice.entity.GiftExample;
import com.blood.bloodservice.service.GiftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zyqfz
 * @date 2019/9/26 - 15:57
 */
@Service
public class GiftServiceImpl implements GiftService {

    @Autowired
    GiftMapper giftMapper;

    //添加献血物资
    @Override
    public int addGift(Gift gift) {
        giftMapper.insert(gift);
        return gift.getId();
    }

    //查看所有物资
    @Override
    public List<Gift> selectGift() {
        List<Gift> list =  giftMapper.selectByExample(null);
        if(list.isEmpty())
            return null;
        else
            return list;
    }

    @Override
    public List<Gift> selectbylid(Integer lid) {
        GiftExample giftExample=new GiftExample();
        GiftExample.Criteria criteria=giftExample.createCriteria();
        criteria.andLidEqualTo(lid);
        List<Gift> list=giftMapper.selectByExample(giftExample);
        if(list.isEmpty())
            return null;
        return list;
    }
}
