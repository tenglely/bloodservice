package com.blood.bloodservice.service.impl;

import com.blood.bloodservice.dao.RegisterMapper;
import com.blood.bloodservice.entity.Register;
import com.blood.bloodservice.entity.RegisterExample;
import com.blood.bloodservice.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class RegisterServiceImpl implements RegisterService {
    @Autowired
    private RegisterMapper registerMapper;

    @Override
    public int addRegister(int uid,int baid) {
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String dateString = formatter.format(currentTime);
        System.out.println("登记信息时间:"+dateString);
        Register register=new Register();
        register.setUid(uid);
        register.setBaid(baid);
        register.setRdate(dateString);
        int id=registerMapper.insert(register);
        System.out.println(register);
        if(id>0)
            return register.getId();
        else
            return 0;
    }

    @Override
    public List<Register> selectbydate(String rdate,int baid) {
        RegisterExample registerExample=new RegisterExample();
        RegisterExample.Criteria criteria=registerExample.createCriteria();
        registerExample.setOrderByClause("id desc");
        criteria.andRdateEqualTo(rdate);
        criteria.andBaidEqualTo(baid);
        List<Register> list=registerMapper.selectByExampleWithUser(registerExample);
        if(list.isEmpty())
            return null;
        for(Register r:list)
            System.out.println(r);
        return list;
    }

    @Override
    public List<Register> selectbymonth(String month,int baid) {

        RegisterExample registerExample=new RegisterExample();
        RegisterExample.Criteria criteria=registerExample.createCriteria();
        criteria.andRdateLike(month+"%");
        criteria.andBaidEqualTo(baid);
        List<Register> list=registerMapper.selectByExampleWithUser(registerExample);
        if(list.isEmpty())
            return null;
        for(Register r:list)
            System.out.println(r);
        return list;
    }
}
