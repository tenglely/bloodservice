package com.blood.bloodservice.entity;

public class Doctor {
    private Integer did;

    private String dname;

    private String dsex;

    private String djob;

    private String didentity;

    private String daddress;

    private String dnation;

    private String dphone;

    private String demail;

    private String dwork;

    private String dphoto;

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname == null ? null : dname.trim();
    }

    public String getDsex() {
        return dsex;
    }

    public void setDsex(String dsex) {
        this.dsex = dsex == null ? null : dsex.trim();
    }

    public String getDjob() {
        return djob;
    }

    public void setDjob(String djob) {
        this.djob = djob == null ? null : djob.trim();
    }

    public String getDidentity() {
        return didentity;
    }

    public void setDidentity(String didentity) {
        this.didentity = didentity == null ? null : didentity.trim();
    }

    public String getDaddress() {
        return daddress;
    }

    public void setDaddress(String daddress) {
        this.daddress = daddress == null ? null : daddress.trim();
    }

    public String getDnation() {
        return dnation;
    }

    public void setDnation(String dnation) {
        this.dnation = dnation == null ? null : dnation.trim();
    }

    public String getDphone() {
        return dphone;
    }

    public void setDphone(String dphone) {
        this.dphone = dphone == null ? null : dphone.trim();
    }

    public String getDemail() {
        return demail;
    }

    public void setDemail(String demail) {
        this.demail = demail == null ? null : demail.trim();
    }

    public String getDwork() {
        return dwork;
    }

    public void setDwork(String dwork) {
        this.dwork = dwork == null ? null : dwork.trim();
    }

    public String getDphoto() {
        return dphoto;
    }

    public void setDphoto(String dphoto) {
        this.dphoto = dphoto == null ? null : dphoto.trim();
    }
}