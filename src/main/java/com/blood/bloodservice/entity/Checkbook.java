package com.blood.bloodservice.entity;

public class Checkbook {
    private Integer id;

    private Integer uid;

    private Integer cid;

    private String bookdate;

    private Integer state;

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

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}