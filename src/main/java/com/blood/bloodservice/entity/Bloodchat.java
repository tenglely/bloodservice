package com.blood.bloodservice.entity;

public class Bloodchat {
    private Integer id;

    private String bmain;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBmain() {
        return bmain;
    }

    public void setBmain(String bmain) {
        this.bmain = bmain == null ? null : bmain.trim();
    }
}