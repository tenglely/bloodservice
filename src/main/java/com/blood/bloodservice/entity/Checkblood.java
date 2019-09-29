package com.blood.bloodservice.entity;

import java.io.Serializable;

public class Checkblood implements Serializable {
    private Integer id;

    private Integer uid;

    private Integer cid;

    private String bookdate;

    private Boolean state;

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

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getBookdate() {
        return bookdate;
    }

    public void setBookdate(String bookdate) {
        this.bookdate = bookdate == null ? null : bookdate.trim();
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Checkblood{" +
                "id=" + id +
                ", uid=" + uid +
                ", cid=" + cid +
                ", bookdate='" + bookdate + '\'' +
                ", state=" + state +
                '}';
    }
}