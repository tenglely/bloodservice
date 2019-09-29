package com.blood.bloodservice.entity;

import java.io.Serializable;

public class Useblood implements Serializable {
    private Integer id;

    private Integer yid;

    private Integer bid;

    private Boolean state;

    private String udate;

    private Integer gid;

    private String gdate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getYid() {
        return yid;
    }

    public void setYid(Integer yid) {
        this.yid = yid;
    }

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public String getUdate() {
        return udate;
    }

    public void setUdate(String udate) {
        this.udate = udate == null ? null : udate.trim();
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public String getGdate() {
        return gdate;
    }

    public void setGdate(String gdate) {
        this.gdate = gdate == null ? null : gdate.trim();
    }

    @Override
    public String toString() {
        return "Useblood{" +
                "id=" + id +
                ", yid=" + yid +
                ", bid=" + bid +
                ", state=" + state +
                ", udate='" + udate + '\'' +
                ", gid=" + gid +
                ", gdate='" + gdate + '\'' +
                '}';
    }
}