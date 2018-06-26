package com.ally.rest.po;

public class TCategory {
    private Integer id;

    private String name;

    private Integer cateCode;

    private Integer parentid;

    private Integer level;

    private Integer idparent;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getCateCode() {
        return cateCode;
    }

    public void setCateCode(Integer cateCode) {
        this.cateCode = cateCode;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getIdparent() {
        return idparent;
    }

    public void setIdparent(Integer idparent) {
        this.idparent = idparent;
    }
}