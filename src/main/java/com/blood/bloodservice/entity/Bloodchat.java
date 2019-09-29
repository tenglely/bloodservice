package com.blood.bloodservice.entity;

import java.io.Serializable;

public class Bloodchat implements Serializable {
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

    @Override
    public String toString() {
        return "Bloodchat{" +
                "id=" + id +
                ", bmain='" + bmain + '\'' +
                '}';
    }
}