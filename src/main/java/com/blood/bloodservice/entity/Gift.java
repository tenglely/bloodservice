package com.blood.bloodservice.entity;

import java.io.Serializable;

public class Gift implements Serializable {
    private Integer id;

    private Integer lid;

    private String ltype;

    private String lname;

    private Integer lnumber;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLid() {
        return lid;
    }

    public void setLid(Integer lid) {
        this.lid = lid;
    }

    public String getLtype() {
        return ltype;
    }

    public void setLtype(String ltype) {
        this.ltype = ltype == null ? null : ltype.trim();
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname == null ? null : lname.trim();
    }

    public Integer getLnumber() {
        return lnumber;
    }

    public void setLnumber(Integer lnumber) {
        this.lnumber = lnumber;
    }

    @Override
    public String toString() {
        return "Gift{" +
                "id=" + id +
                ", lid=" + lid +
                ", ltype='" + ltype + '\'' +
                ", lname='" + lname + '\'' +
                ", lnumber=" + lnumber +
                '}';
    }
}