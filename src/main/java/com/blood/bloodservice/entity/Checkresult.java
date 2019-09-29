package com.blood.bloodservice.entity;

import java.io.Serializable;

public class Checkresult implements Serializable {
    private Integer id;

    private Integer uid;

    private Double weight;

    private Integer blv;

    private String bya;

    private String btype;

    private String bdan;

    private Boolean byi;

    private Integer bmei;

    private Integer yid;

    private String ctime;

    private Boolean cstate;

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

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Integer getBlv() {
        return blv;
    }

    public void setBlv(Integer blv) {
        this.blv = blv;
    }

    public String getBya() {
        return bya;
    }

    public void setBya(String bya) {
        this.bya = bya == null ? null : bya.trim();
    }

    public String getBtype() {
        return btype;
    }

    public void setBtype(String btype) {
        this.btype = btype == null ? null : btype.trim();
    }

    public String getBdan() {
        return bdan;
    }

    public void setBdan(String bdan) {
        this.bdan = bdan == null ? null : bdan.trim();
    }

    public Boolean getByi() {
        return byi;
    }

    public void setByi(Boolean byi) {
        this.byi = byi;
    }

    public Integer getBmei() {
        return bmei;
    }

    public void setBmei(Integer bmei) {
        this.bmei = bmei;
    }

    public Integer getYid() {
        return yid;
    }

    public void setYid(Integer yid) {
        this.yid = yid;
    }

    public String getCtime() {
        return ctime;
    }

    public void setCtime(String ctime) {
        this.ctime = ctime == null ? null : ctime.trim();
    }

    public Boolean getCstate() {
        return cstate;
    }

    public void setCstate(Boolean cstate) {
        this.cstate = cstate;
    }

    @Override
    public String toString() {
        return "Checkresult{" +
                "id=" + id +
                ", uid=" + uid +
                ", weight=" + weight +
                ", blv=" + blv +
                ", bya='" + bya + '\'' +
                ", btype='" + btype + '\'' +
                ", bdan='" + bdan + '\'' +
                ", byi=" + byi +
                ", bmei=" + bmei +
                ", yid=" + yid +
                ", ctime='" + ctime + '\'' +
                ", cstate=" + cstate +
                '}';
    }
}