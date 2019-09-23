package com.blood.bloodservice.entity;

public class Checkresult {
    private Integer id;

    private Integer uid;

    private Integer cstate;

    private String cresult;

    private Integer yid;

    private Integer ctime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getCstate() {
        return cstate;
    }

    public void setCstate(Integer cstate) {
        this.cstate = cstate;
    }

    public String getCresult() {
        return cresult;
    }

    public void setCresult(String cresult) {
        this.cresult = cresult == null ? null : cresult.trim();
    }

    public Integer getYid() {
        return yid;
    }

    public void setYid(Integer yid) {
        this.yid = yid;
    }

    public Integer getCtime() {
        return ctime;
    }

    public void setCtime(Integer ctime) {
        this.ctime = ctime;
    }
}