package com.blood.bloodservice.entity;

public class Cblood {
    private Integer cid;

    private Integer uid;

    private Integer lid;

    private String cmain;

    private String caddress;

    private String cdate;

    private String checkaddress;

    private String checktime;

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

    public String getCaddress() {
        return caddress;
    }

    public void setCaddress(String caddress) {
        this.caddress = caddress == null ? null : caddress.trim();
    }

    public String getCdate() {
        return cdate;
    }

    public void setCdate(String cdate) {
        this.cdate = cdate == null ? null : cdate.trim();
    }

    public String getCheckaddress() {
        return checkaddress;
    }

    public void setCheckaddress(String checkaddress) {
        this.checkaddress = checkaddress == null ? null : checkaddress.trim();
    }

    public String getChecktime() {
        return checktime;
    }

    public void setChecktime(String checktime) {
        this.checktime = checktime == null ? null : checktime.trim();
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
}