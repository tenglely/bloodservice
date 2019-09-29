package com.blood.bloodservice.entity;

import java.io.Serializable;

public class Inform implements Serializable {
    private Integer id;

    private Integer uid;

    private String usertype;

    private String content;

    private String senddate;

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

    public String getUsertype() {
        return usertype;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype == null ? null : usertype.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getSenddate() {
        return senddate;
    }

    public void setSenddate(String senddate) {
        this.senddate = senddate == null ? null : senddate.trim();
    }

    @Override
    public String toString() {
        return "Inform{" +
                "id=" + id +
                ", uid=" + uid +
                ", usertype='" + usertype + '\'' +
                ", content='" + content + '\'' +
                ", senddate='" + senddate + '\'' +
                '}';
    }
}