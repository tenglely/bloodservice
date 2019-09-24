package com.blood.bloodservice.service.impl;

import com.blood.bloodservice.dao.UserloginMapper;
import com.blood.bloodservice.dao.ZrootMapper;
import com.blood.bloodservice.entity.UserRole;
import com.blood.bloodservice.entity.Zroot;
import com.blood.bloodservice.service.ZrootService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class ZrootServiceImpl implements ZrootService {
    @Autowired
    private ZrootMapper zrootMapper;
    @Autowired
    private UserloginMapper userloginMapper;

    @Override
    public int addZroot(String gname,String gsex,String gemail,String gphone) {
        Zroot zroot=new Zroot();
        zroot.setGname(gname);
        zroot.setGemail(gemail);
        zroot.setGphone(gphone);
        zroot.setGsex(gsex);
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = formatter.format(currentTime);
        zroot.setGdate(dateString);
        zrootMapper.insert(zroot);
        System.out.println(zroot.getGid());
        return zroot.getGid();
    }

    @Override
    public void addRoot(int did) {
        for(int i=1;i<=3;i++){
            UserRole userRole=new UserRole();
            userRole.setUid(did);
            userRole.setRid(i);
            System.out.println(userRole);
            userloginMapper.insertUserRole(userRole);
        }
        System.out.println("超级管理员添加管理员权限角色成功!");
    }
}
