package com.blood.bloodservice.entity;

import java.io.Serializable;

public class Sendblood implements Serializable {
    private Integer bid;

    private Integer uid;

    private Integer yid;

    private Integer sbnumber;

    private String sbtype;

    private String bless;

    private String sbaddress;

    private String sbpeople;

    private String sbdate;

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

    public Integer getYid() {
        return yid;
    }

    public void setYid(Integer yid) {
        this.yid = yid;
    }

    public Integer getSbnumber() {
        return sbnumber;
    }

    public void setSbnumber(Integer sbnumber) {
        this.sbnumber = sbnumber;
    }

    public String getSbtype() {
        return sbtype;
    }

    public void setSbtype(String sbtype) {
        this.sbtype = sbtype == null ? null : sbtype.trim();
    }

    public String getBless() {
        return bless;
    }

    public void setBless(String bless) {
        this.bless = bless == null ? null : bless.trim();
    }

    public String getSbaddress() {
        return sbaddress;
    }

    public void setSbaddress(String sbaddress) {
        this.sbaddress = sbaddress == null ? null : sbaddress.trim();
    }

    public String getSbpeople() {
        return sbpeople;
    }

    public void setSbpeople(String sbpeople) {
        this.sbpeople = sbpeople == null ? null : sbpeople.trim();
    }

    public String getSbdate() {
        return sbdate;
    }

    public void setSbdate(String sbdate) {
        this.sbdate = sbdate == null ? null : sbdate.trim();
    }

    @Override
    public String toString() {
        return "Sendblood{" +
                "bid=" + bid +
                ", uid=" + uid +
                ", yid=" + yid +
                ", sbnumber=" + sbnumber +
                ", sbtype='" + sbtype + '\'' +
                ", bless='" + bless + '\'' +
                ", sbaddress='" + sbaddress + '\'' +
                ", sbpeople='" + sbpeople + '\'' +
                ", sbdate='" + sbdate + '\'' +
                '}';
    }
}