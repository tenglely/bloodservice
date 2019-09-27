package com.blood.bloodservice.entity;

public class Register {
    private Integer id;

    private Integer uid;

    private String rdate;

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

    public String getRdate() {
        return rdate;
    }

    public void setRdate(String rdate) {
        this.rdate = rdate == null ? null : rdate.trim();
    }
}