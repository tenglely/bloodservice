package com.blood.bloodservice.entity;

import java.io.Serializable;

public class Checkagain implements Serializable {
    private Integer cid;

    private Integer bid;

    private Integer uid;

    private String btype;

    private String cdan;

    private Boolean cyi;

    private Integer cmei;

    private Boolean cbing;

    private Boolean cmeidu;

    private Boolean chiv;

    private Boolean cstate;

    private Integer yid;

    private String cdate;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getBtype() {
        return btype;
    }

    public void setBtype(String btype) {
        this.btype = btype == null ? null : btype.trim();
    }

    public String getCdan() {
        return cdan;
    }

    public void setCdan(String cdan) {
        this.cdan = cdan == null ? null : cdan.trim();
    }

    public Boolean getCyi() {
        return cyi;
    }

    public void setCyi(Boolean cyi) {
        this.cyi = cyi;
    }

    public Integer getCmei() {
        return cmei;
    }

    public void setCmei(Integer cmei) {
        this.cmei = cmei;
    }

    public Boolean getCbing() {
        return cbing;
    }

    public void setCbing(Boolean cbing) {
        this.cbing = cbing;
    }

    public Boolean getCmeidu() {
        return cmeidu;
    }

    public void setCmeidu(Boolean cmeidu) {
        this.cmeidu = cmeidu;
    }

    public Boolean getChiv() {
        return chiv;
    }

    public void setChiv(Boolean chiv) {
        this.chiv = chiv;
    }

    public Boolean getCstate() {
        return cstate;
    }

    public void setCstate(Boolean cstate) {
        this.cstate = cstate;
    }

    public Integer getYid() {
        return yid;
    }

    public void setYid(Integer yid) {
        this.yid = yid;
    }

    public String getCdate() {
        return cdate;
    }

    public void setCdate(String cdate) {
        this.cdate = cdate == null ? null : cdate.trim();
    }


    @Override
    public String toString() {
        return "Checkagain{" +
                "cid=" + cid +
                ", bid=" + bid +
                ", uid=" + uid +
                ", btype='" + btype + '\'' +
                ", cdan='" + cdan + '\'' +
                ", cyi=" + cyi +
                ", cmei=" + cmei +
                ", cbing=" + cbing +
                ", cmeidu=" + cmeidu +
                ", chiv=" + chiv +
                ", cstate=" + cstate +
                ", yid=" + yid +
                ", cdate='" + cdate + '\'' +
                '}';
    }
}