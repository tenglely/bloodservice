package com.blood.bloodservice.service.impl;

import com.blood.bloodservice.dao.RegisterMapper;
import com.blood.bloodservice.entity.Gift;
import com.blood.bloodservice.entity.Register;
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
    public int addRegister(int uid,int bid) {
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String dateString = formatter.format(currentTime);
        Register register=new Register();
        register.setUid(uid);
        register.setBid(bid);
        register.setRdate(dateString);
        int id=registerMapper.insert(register);
        System.out.println(register);
        if(id>0)
            return register.getId();
        else
            return 0;
    }

    //查询指标
    @Override
    public List<Register> selectRegister() {
        List<Register> list =  registerMapper.selectByExample(null);
        if(list!=null)
            return list;
        else
            return null;
    }
}
