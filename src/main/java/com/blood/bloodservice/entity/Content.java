package com.blood.bloodservice.entity;

import java.io.Serializable;

public class Content implements Serializable {
    private Integer cid;

    private Integer pid;

    private String content;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    @Override
    public String toString() {
        return "Content{" +
                "cid=" + cid +
                ", pid=" + pid +
                ", content='" + content + '\'' +
                '}';
    }
}