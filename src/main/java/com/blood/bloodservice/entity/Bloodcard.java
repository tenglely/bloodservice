package com.blood.bloodservice.entity;

import java.io.Serializable;

public class Bloodcard implements Serializable {
    private Integer id;

    private String bid;

    private Integer uid;

    private String senddate;

    private String sendaddress;

    private Boolean state;

    private People people;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBid() {
        return bid;
    }

    public void setBid(String bid) {
        this.bid = bid == null ? null : bid.trim();
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getSenddate() {
        return senddate;
    }

    public void setSenddate(String senddate) {
        this.senddate = senddate == null ? null : senddate.trim();
    }

    public String getSendaddress() {
        return sendaddress;
    }

    public void setSendaddress(String sendaddress) {
        this.sendaddress = sendaddress == null ? null : sendaddress.trim();
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public People getPeople() {
        return people;
    }

    public void setPeople(People people) {
        this.people = people;
    }

    @Override
    public String toString() {
        return "Bloodcard{" +
                "id=" + id +
                ", bid='" + bid + '\'' +
                ", uid=" + uid +
                ", senddate='" + senddate + '\'' +
                ", sendaddress='" + sendaddress + '\'' +
                ", state=" + state +
                ", people=" + people +
                '}';
    }
}