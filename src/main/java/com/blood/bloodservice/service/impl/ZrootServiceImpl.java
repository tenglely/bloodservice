package com.blood.bloodservice.service.impl;

import com.blood.bloodservice.dao.ZrootMapper;
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
}
