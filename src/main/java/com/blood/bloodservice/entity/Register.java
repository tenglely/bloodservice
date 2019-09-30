package com.blood.bloodservice.entity;

import java.io.Serializable;

public class Register implements Serializable {
    private Integer id;

    private Integer uid;

    private Integer bid;

    private String rdate;

    private People people;

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

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public String getRdate() {
        return rdate;
    }

    public void setRdate(String rdate) {
        this.rdate = rdate == null ? null : rdate.trim();
    }

    public People getPeople() {
        return people;
    }

    public void setPeople(People people) {
        this.people = people;
    }

    @Override
    public String toString() {
        return "Register{" +
                "id=" + id +
                ", uid=" + uid +
                ", bid=" + bid +
                ", rdate='" + rdate + '\'' +
                ", people=" + people +
                '}';
    }
}