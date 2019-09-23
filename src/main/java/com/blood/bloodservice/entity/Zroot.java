package com.blood.bloodservice.entity;

public class Zroot {
    private Integer gid;

    private String gname;

    private String gsex;

    private String gemail;

    private String gphone;

    private String gdate;

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname == null ? null : gname.trim();
    }

    public String getGsex() {
        return gsex;
    }

    public void setGsex(String gsex) {
        this.gsex = gsex == null ? null : gsex.trim();
    }

    public String getGemail() {
        return gemail;
    }

    public void setGemail(String gemail) {
        this.gemail = gemail == null ? null : gemail.trim();
    }

    public String getGphone() {
        return gphone;
    }

    public void setGphone(String gphone) {
        this.gphone = gphone == null ? null : gphone.trim();
    }

    public String getGdate() {
        return gdate;
    }

    public void setGdate(String gdate) {
        this.gdate = gdate == null ? null : gdate.trim();
    }
}