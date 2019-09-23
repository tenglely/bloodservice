package com.blood.bloodservice.service;

import com.blood.bloodservice.entity.Zroot;

public interface ZrootService {
    /**
     * 添加管理员
     * @param zroot
     * @return
     */
    public int addZroot(String gname,String gsex,String gemail,String gphone);
}
