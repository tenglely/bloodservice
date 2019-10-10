package com.blood.bloodservice.service.impl;

import com.blood.bloodservice.dao.CbloodMapper;
import com.blood.bloodservice.entity.Cblood;
import com.blood.bloodservice.entity.CbloodExample;
import com.blood.bloodservice.service.CbloodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zyqfz
 * @date 2019/9/26 - 15:25
 */
@Service
public class CbloodServiceImpl implements CbloodService {

    @Autowired
    CbloodMapper cbloodMapper;

    //添加献血通知表信息
    @Override
    public int addCblood(Cblood cblood) {

      cbloodMapper.insert(cblood);
        return  cblood.getCid();
    }

    @Override
    public Cblood findbycid(int cid) {
        Cblood cblood=cbloodMapper.selectByPrimaryKey(cid);
        return cblood;
    }

    @Override
    public List<Cblood> selectall() {
        CbloodExample cbloodExample=new CbloodExample();
        cbloodExample.setOrderByClause("cid desc");
        CbloodExample.Criteria criteria=cbloodExample.createCriteria();
        criteria.andCstateEqualTo(1);
        List<Cblood> list=cbloodMapper.selectByExampleWithUser(cbloodExample);
        if(list.isEmpty())
            return null;
        return list;
    }

    @Override
    public List<Cblood> findallcblood() {
        CbloodExample cbloodExample=new CbloodExample();
        cbloodExample.setOrderByClause("cid desc");
        List<Cblood> list=cbloodMapper.selectByExampleWithUser(cbloodExample);
        if(list.isEmpty())
            return null;
        return list;
    }

    @Override
    public List<Cblood> findbyaddress(int bid) {
        CbloodExample cbloodExample=new CbloodExample();
        cbloodExample.setOrderByClause("cid desc");
        CbloodExample.Criteria criteria=cbloodExample.createCriteria();
        criteria.andBidEqualTo(bid);
        List<Cblood> list=cbloodMapper.selectByExampleWithUser(cbloodExample);
        if(list.isEmpty())
            return null;
        return list;
    }
}
