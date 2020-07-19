package com.ally.manager.pojo;

public class TStoreWd {
    private Integer id;

    private Integer userid;

    private String wwwname;

    private String www;

    private Integer categoryid;

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

    public String getWwwname() {
        return wwwname;
    }

    public void setWwwname(String wwwname) {
        this.wwwname = wwwname == null ? null : wwwname.trim();
    }

    public String getWww() {
        return www;
    }

    public void setWww(String www) {
        this.www = www == null ? null : www.trim();
    }

    public Integer getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(Integer categoryid) {
        this.categoryid = categoryid;
    }
}