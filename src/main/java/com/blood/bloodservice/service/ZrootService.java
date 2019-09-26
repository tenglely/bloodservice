package com.blood.bloodservice.service;

import com.blood.bloodservice.entity.Zroot;

public interface ZrootService {
    /**
     * 添加管理员
     * @param
     * @return
     */
    public int addZroot(String gname,String gsex,String gemail,String gphone);
    //public int addZroot(Zroot zroot);
    /**
     * 超级管理员添加管理员权限对象
     * @param gid
     */
    public void addRoot(int gid);
}
