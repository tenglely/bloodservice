package com.blood.bloodservice.entity;

import java.io.Serializable;

public class People implements Serializable {
    private Integer uid;

    private String uname;

    private String usex;

    private String uage;

    private String uidentity;

    private String uaddress;

    private String unation;

    private String uphone;

    private String uemail;

    private String ublood;

    private Integer bid;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname == null ? null : uname.trim();
    }

    public String getUsex() {
        return usex;
    }

    public void setUsex(String usex) {
        this.usex = usex == null ? null : usex.trim();
    }

    public String getUage() {
        return uage;
    }

    public void setUage(String uage) {
        this.uage = uage == null ? null : uage.trim();
    }

    public String getUidentity() {
        return uidentity;
    }

    public void setUidentity(String uidentity) {
        this.uidentity = uidentity == null ? null : uidentity.trim();
    }

    public String getUaddress() {
        return uaddress;
    }

    public void setUaddress(String uaddress) {
        this.uaddress = uaddress == null ? null : uaddress.trim();
    }

    public String getUnation() {
        return unation;
    }

    public void setUnation(String unation) {
        this.unation = unation == null ? null : unation.trim();
    }

    public String getUphone() {
        return uphone;
    }

    public void setUphone(String uphone) {
        this.uphone = uphone == null ? null : uphone.trim();
    }

    public String getUemail() {
        return uemail;
    }

    public void setUemail(String uemail) {
        this.uemail = uemail == null ? null : uemail.trim();
    }

    public String getUblood() {
        return ublood;
    }

    public void setUblood(String ublood) {
        this.ublood = ublood == null ? null : ublood.trim();
    }

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    @Override
    public String toString() {
        return "People{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", usex='" + usex + '\'' +
                ", uage='" + uage + '\'' +
                ", uidentity='" + uidentity + '\'' +
                ", uaddress='" + uaddress + '\'' +
                ", unation='" + unation + '\'' +
                ", uphone='" + uphone + '\'' +
                ", uemail='" + uemail + '\'' +
                ", ublood='" + ublood + '\'' +
                ", bid=" + bid +
                '}';
    }
}