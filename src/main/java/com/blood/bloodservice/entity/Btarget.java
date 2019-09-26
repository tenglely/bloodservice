package com.blood.bloodservice.entity;

public class Btarget {
    private Integer id;

    private String cdan;

    private Boolean cyi;

    private Integer cmei;

    private Boolean cbing;

    private Boolean cmeidu;

    private Boolean chiv;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCdan() {
        return cdan;
    }

    public void setCdan(String cdan) {
        this.cdan = cdan == null ? null : cdan.trim();
    }

    public Boolean getCyi() {
        return cyi;
    }

    public void setCyi(Boolean cyi) {
        this.cyi = cyi;
    }

    public Integer getCmei() {
        return cmei;
    }

    public void setCmei(Integer cmei) {
        this.cmei = cmei;
    }

    public Boolean getCbing() {
        return cbing;
    }

    public void setCbing(Boolean cbing) {
        this.cbing = cbing;
    }

    public Boolean getCmeidu() {
        return cmeidu;
    }

    public void setCmeidu(Boolean cmeidu) {
        this.cmeidu = cmeidu;
    }

    public Boolean getChiv() {
        return chiv;
    }

    public void setChiv(Boolean chiv) {
        this.chiv = chiv;
    }
}