package com.ally.rest.po;

import java.util.Date;

public class TProduct {
    private String id;

    private String name;

    private Date shelftime;

    private Date updateTime;

    private String color;

    private String sku;

    private Integer skuStatus;

    private String picture;

    private Integer quantity;

    private String size;

    private Float weight;

    private String sellPoint;

    private String recommendprice;

    private Integer sCategoryid;

    private Integer warehouseid;

    private Integer fCategoryid;

    private Integer userid;

    private Integer tCategoryid;

    private Float price;

    private String details;
       

    public TProduct() {
		super();
	}

	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Date getShelftime() {
        return shelftime;
    }

    public void setShelftime(Date shelftime) {
        this.shelftime = shelftime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color == null ? null : color.trim();
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku == null ? null : sku.trim();
    }

    public Integer getSkuStatus() {
        return skuStatus;
    }

    public void setSkuStatus(Integer skuStatus) {
        this.skuStatus = skuStatus;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size == null ? null : size.trim();
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public String getSellPoint() {
        return sellPoint;
    }

    public void setSellPoint(String sellPoint) {
        this.sellPoint = sellPoint == null ? null : sellPoint.trim();
    }

    public String getRecommendprice() {
        return recommendprice;
    }

    public void setRecommendprice(String recommendprice) {
        this.recommendprice = recommendprice == null ? null : recommendprice.trim();
    }

    public Integer getsCategoryid() {
        return sCategoryid;
    }

    public void setsCategoryid(Integer sCategoryid) {
        this.sCategoryid = sCategoryid;
    }

    public Integer getWarehouseid() {
        return warehouseid;
    }

    public void setWarehouseid(Integer warehouseid) {
        this.warehouseid = warehouseid;
    }

    public Integer getfCategoryid() {
        return fCategoryid;
    }

    public void setfCategoryid(Integer fCategoryid) {
        this.fCategoryid = fCategoryid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer gettCategoryid() {
        return tCategoryid;
    }

    public void settCategoryid(Integer tCategoryid) {
        this.tCategoryid = tCategoryid;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details == null ? null : details.trim();
    }

	@Override
	public String toString() {
		return "TProduct [id=" + id + ", name=" + name + ", shelftime=" + shelftime + ", updateTime=" + updateTime
				+ ", color=" + color + ", sku=" + sku + ", skuStatus=" + skuStatus + ", picture=" + picture
				+ ", quantity=" + quantity + ", size=" + size + ", weight=" + weight + ", sellPoint=" + sellPoint
				+ ", recommendprice=" + recommendprice + ", sCategoryid=" + sCategoryid + ", warehouseid=" + warehouseid
				+ ", fCategoryid=" + fCategoryid + ", userid=" + userid + ", tCategoryid=" + tCategoryid + ", price="
				+ price + ", details=" + details + "]";
	}
    
}