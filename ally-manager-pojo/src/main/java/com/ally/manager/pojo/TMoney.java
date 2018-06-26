package com.ally.manager.pojo;

public class TMoney {
    private Integer id;

    private Integer userid;

    private String totalmoney;

    private Integer state;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getTotalmoney() {
        return totalmoney;
    }

    public void setTotalmoney(String totalmoney) {
        this.totalmoney = totalmoney == null ? null : totalmoney.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}