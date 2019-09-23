package com.blood.bloodservice.entity;

public class Blood {
    private Integer bid;

    private Integer uid;

    private Double amount;

    private String btype;

    private String bless;

    private String btime;

    private Integer state;

    private Integer bstate;

    private String baddress;

    private Integer yid;

    private String inputdate;

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getBtype() {
        return btype;
    }

    public void setBtype(String btype) {
        this.btype = btype == null ? null : btype.trim();
    }

    public String getBless() {
        return bless;
    }

    public void setBless(String bless) {
        this.bless = bless == null ? null : bless.trim();
    }

    public String getBtime() {
        return btime;
    }

    public void setBtime(String btime) {
        this.btime = btime == null ? null : btime.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getBstate() {
        return bstate;
    }

    public void setBstate(Integer bstate) {
        this.bstate = bstate;
    }

    public String getBaddress() {
        return baddress;
    }

    public void setBaddress(String baddress) {
        this.baddress = baddress == null ? null : baddress.trim();
    }

    public Integer getYid() {
        return yid;
    }

    public void setYid(Integer yid) {
        this.yid = yid;
    }

    public String getInputdate() {
        return inputdate;
    }

    public void setInputdate(String inputdate) {
        this.inputdate = inputdate == null ? null : inputdate.trim();
    }
}