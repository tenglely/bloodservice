package com.blood.bloodservice.service.impl;

import com.blood.bloodservice.dao.UsebloodMapper;
import com.blood.bloodservice.entity.Useblood;
import com.blood.bloodservice.entity.UsebloodExample;
import com.blood.bloodservice.service.UsebloodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 血液使用情况表
 * @author zyqfz
 * @date 2019/9/27 - 8:24
 */
@Service
public class UsebloodServiceImpl implements UsebloodService {
    @Autowired
    UsebloodMapper usebloodMapper;
    @Override
    public int addUseblood(Useblood useblood) {
        usebloodMapper.insert(useblood);
        return useblood.getId();
    }

    //查询血液使用情况列表
    @Override
    public List<Useblood> selectAllUseblood() {
        UsebloodExample usebloodExample = new UsebloodExample();
        usebloodExample.setOrderByClause("id desc");
        List<Useblood> list = usebloodMapper.selectByExample(usebloodExample);
        if(list.isEmpty())
            return null;
        else
            return list;
    }

    //根据使用血液id查询详细使用情况
    @Override
    public Useblood selectOneUseblood(Integer id) {
        Useblood useblood = usebloodMapper.selectByPrimaryKey(id);
        if(useblood!=null)
            return useblood;
        else
        return null;
    }

    //根据血液领取状态查询血液使用列表
    @Override
    public List<Useblood> selectUsebloodBystate(Boolean state) {
        UsebloodExample usebloodExample = new UsebloodExample();
        usebloodExample.setOrderByClause("id desc");
        UsebloodExample.Criteria criteria = usebloodExample.createCriteria();
        criteria.andStateEqualTo(state);
        List<Useblood> list = usebloodMapper.selectByExample(usebloodExample);
        if(list.isEmpty())
            return null;
        else
            return list;
    }
}
