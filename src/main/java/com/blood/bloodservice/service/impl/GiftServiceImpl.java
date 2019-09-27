package com.blood.bloodservice.service.impl;



import com.blood.bloodservice.dao.GiftMapper;
import com.blood.bloodservice.entity.Gift;
import com.blood.bloodservice.service.GiftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zyqfz
 * @date 2019/9/26 - 15:57
 */
@Service
public class GiftServiceImpl implements GiftService {

    @Autowired
    GiftMapper giftMapper;

    @Override
    public int addGift(Gift gift) {
        giftMapper.insert(gift);
        return gift.getId();
    }
}
