package com.ally.manager.pojo.my;

import java.util.Date;

public class MyTWarehouse {
	 private Integer id;

	 private String name;
	 
	 private String detailaddress;
	 
	 private String type;
	 
	 private Date registertime;

	 private Date updatetime;
	 
	 private String username;
	 
	 private String phone;
	 
	 private Integer postcode;

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
		this.name = name;
	}

	public String getDetailaddress() {
		return detailaddress;
	}

	public void setDetailaddress(String detailaddress) {
		this.detailaddress = detailaddress;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Integer getPostcode() {
		return postcode;
	}

	public void setPostcode(Integer postcode) {
		this.postcode = postcode;
	}
	 
	
}
