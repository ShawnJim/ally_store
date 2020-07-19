package com.ally.manager.pojo.my;

import java.util.Date;

public class MyTProduct {
    private String id;

    private String productName;
    
    private String recommendPrice;
    
    private String categoryName;
    
    private String username;
    
    private Integer skuStatus;

    private Date shelftime;

    private Date updateTime;
    
    private Integer state;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getRecommendPrice() {
		return recommendPrice;
	}

	public void setRecommendPrice(String recommendPrice) {
		this.recommendPrice = recommendPrice;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Integer getSkuStatus() {
		return skuStatus;
	}

	public void setSkuStatus(Integer skuStatus) {
		this.skuStatus = skuStatus;
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

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}
    
    

}