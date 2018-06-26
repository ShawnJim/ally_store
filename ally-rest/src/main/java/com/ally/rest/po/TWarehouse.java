package com.ally.rest.po;

import java.util.Date;

public class TWarehouse {
    private Integer id;

    private String name;

    private Integer userid;

    private Integer countryid;

    private Integer citiesid;

    private Integer districtofcountryid;

    private Integer districtofcityid;

    private String detailaddress;

    private Integer postcode;

    private String type;

    private Date registertime;

    private Date updatetime;

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

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getCountryid() {
        return countryid;
    }

    public void setCountryid(Integer countryid) {
        this.countryid = countryid;
    }

    public Integer getCitiesid() {
        return citiesid;
    }

    public void setCitiesid(Integer citiesid) {
        this.citiesid = citiesid;
    }

    public Integer getDistrictofcountryid() {
        return districtofcountryid;
    }

    public void setDistrictofcountryid(Integer districtofcountryid) {
        this.districtofcountryid = districtofcountryid;
    }

    public Integer getDistrictofcityid() {
        return districtofcityid;
    }

    public void setDistrictofcityid(Integer districtofcityid) {
        this.districtofcityid = districtofcityid;
    }

    public String getDetailaddress() {
        return detailaddress;
    }

    public void setDetailaddress(String detailaddress) {
        this.detailaddress = detailaddress == null ? null : detailaddress.trim();
    }

    public Integer getPostcode() {
        return postcode;
    }

    public void setPostcode(Integer postcode) {
        this.postcode = postcode;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Date getRegistertime() {
        return registertime;
    }

    public void setRegistertime(Date registertime) {
        this.registertime = registertime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}