package com.blood.bloodservice.service.impl;

import com.blood.bloodservice.dao.DoctorMapper;
import com.blood.bloodservice.dao.PeopleMapper;
import com.blood.bloodservice.dao.SendbloodMapper;
import com.blood.bloodservice.entity.Doctor;
import com.blood.bloodservice.entity.People;
import com.blood.bloodservice.entity.Sendblood;
import com.blood.bloodservice.entity.SendbloodExample;
import com.blood.bloodservice.service.SendbloodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 *献血记录
 * @author zyqfz
 * @date 2019/9/26 - 17:34
 */
@Service
public class SendbloodServiceImpl implements SendbloodService {

    @Autowired
    SendbloodMapper sendbloodMapper;
    @Autowired
    PeopleMapper peopleMapper;
    @Autowired
    DoctorMapper doctorMapper;

    @Override
    public int addSendBlood(Sendblood sendblood) {

        sendbloodMapper.insert(sendblood);
        return sendblood.getBid();
    }

    @Override
    public List<Sendblood> selectall() {
        SendbloodExample sendbloodExample=new SendbloodExample();
        sendbloodExample.setOrderByClause("bid desc");
        List<Sendblood> list=sendbloodMapper.selectByExample(sendbloodExample);
        if(list.isEmpty())
            return null;
        return list;
    }

    @Override
    public List<Sendblood> selectbyyid(Integer yid) {
        SendbloodExample sendbloodExample=new SendbloodExample();
        sendbloodExample.setOrderByClause("bid desc");
        SendbloodExample.Criteria criteria=sendbloodExample.createCriteria();
        criteria.andYidEqualTo(yid);
        List<Sendblood> list=sendbloodMapper.selectByExample(sendbloodExample);
        if(list.isEmpty())
            return null;
        return list;
    }

    @Override
    public List<Sendblood> selectbyuid(Integer uid) {
        SendbloodExample sendbloodExample=new SendbloodExample();
        sendbloodExample.setOrderByClause("bid desc");
        SendbloodExample.Criteria criteria=sendbloodExample.createCriteria();
        criteria.andUidEqualTo(uid);
        List<Sendblood> list=sendbloodMapper.selectByExample(sendbloodExample);
        if(list.isEmpty())
            return null;
        return list;
    }




}
