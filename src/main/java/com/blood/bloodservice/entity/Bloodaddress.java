package com.blood.bloodservice.entity;

import java.io.Serializable;

public class Bloodaddress implements Serializable {
    private Integer bid;

    private String city;

    private String county;

    private String baddress;

    private String btype;

    private Boolean bstate;

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county == null ? null : county.trim();
    }

    public String getBaddress() {
        return baddress;
    }

    public void setBaddress(String baddress) {
        this.baddress = baddress == null ? null : baddress.trim();
    }

    public String getBtype() {
        return btype;
    }

    public void setBtype(String btype) {
        this.btype = btype == null ? null : btype.trim();
    }

    public Boolean getBstate() {
        return bstate;
    }

    public void setBstate(Boolean bstate) {
        this.bstate = bstate;
    }

    @Override
    public String toString() {
        return "Bloodaddress{" +
                "bid=" + bid +
                ", city='" + city + '\'' +
                ", county='" + county + '\'' +
                ", baddress='" + baddress + '\'' +
                ", btype='" + btype + '\'' +
                ", bstate=" + bstate +
                '}';
    }
}