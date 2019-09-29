package com.blood.bloodservice.entity;

import java.io.Serializable;

public class Cblood implements Serializable {
    private Integer cid;

    private Integer uid;

    private Integer lid;

    private String cmain;

    private Integer bid;

    private String cdate;

    private String ctime;

    private String covertime;

    private Integer cstate;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getLid() {
        return lid;
    }

    public void setLid(Integer lid) {
        this.lid = lid;
    }

    public String getCmain() {
        return cmain;
    }

    public void setCmain(String cmain) {
        this.cmain = cmain == null ? null : cmain.trim();
    }

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public String getCdate() {
        return cdate;
    }

    public void setCdate(String cdate) {
        this.cdate = cdate == null ? null : cdate.trim();
    }

    public String getCtime() {
        return ctime;
    }

    public void setCtime(String ctime) {
        this.ctime = ctime == null ? null : ctime.trim();
    }

    public String getCovertime() {
        return covertime;
    }

    public void setCovertime(String covertime) {
        this.covertime = covertime == null ? null : covertime.trim();
    }

    public Integer getCstate() {
        return cstate;
    }

    public void setCstate(Integer cstate) {
        this.cstate = cstate;
    }

    @Override
    public String toString() {
        return "Cblood{" +
                "cid=" + cid +
                ", uid=" + uid +
                ", lid=" + lid +
                ", cmain='" + cmain + '\'' +
                ", bid=" + bid +
                ", cdate='" + cdate + '\'' +
                ", ctime='" + ctime + '\'' +
                ", covertime='" + covertime + '\'' +
                ", cstate=" + cstate +
                '}';
    }

}