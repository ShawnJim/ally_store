package com.ally.rest.po;

import java.util.Date;
import java.util.List;

public class TOrderVO {
    private Integer id;

    private String orderuuid;

    private String nameofconsignee;

    private String address;

    private String consigneetelephone;

    private Integer orderstatus;

    private Date creationtime;

    private Date paytime;

    private String note;

    private String productid;

    private Integer destinationcountryid;

    private Integer stoid;

    private Integer braid;

    private Integer warehouseid;

    private Integer logisticid;

    private Integer productnum;

    private Float totalprice;

    private String barCode;
    
    List<TProduct> products;

    /**
	 * @return the products
	 */
	public List<TProduct> getProducts() {
		return products;
	}

	/**
	 * @param products the products to set
	 */
	public void setProducts(List<TProduct> products) {
		this.products = products;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderuuid() {
        return orderuuid;
    }

    public void setOrderuuid(String orderuuid) {
        this.orderuuid = orderuuid == null ? null : orderuuid.trim();
    }

    public String getNameofconsignee() {
        return nameofconsignee;
    }

    public void setNameofconsignee(String nameofconsignee) {
        this.nameofconsignee = nameofconsignee == null ? null : nameofconsignee.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getConsigneetelephone() {
        return consigneetelephone;
    }

    public void setConsigneetelephone(String consigneetelephone) {
        this.consigneetelephone = consigneetelephone == null ? null : consigneetelephone.trim();
    }

    public Integer getOrderstatus() {
        return orderstatus;
    }

    public void setOrderstatus(Integer orderstatus) {
        this.orderstatus = orderstatus;
    }

    public Date getCreationtime() {
        return creationtime;
    }

    public void setCreationtime(Date creationtime) {
        this.creationtime = creationtime;
    }

    public Date getPaytime() {
        return paytime;
    }

    public void setPaytime(Date paytime) {
        this.paytime = paytime;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid == null ? null : productid.trim();
    }

    public Integer getDestinationcountryid() {
        return destinationcountryid;
    }

    public void setDestinationcountryid(Integer destinationcountryid) {
        this.destinationcountryid = destinationcountryid;
    }

    public Integer getStoid() {
        return stoid;
    }

    public void setStoid(Integer stoid) {
        this.stoid = stoid;
    }

    public Integer getBraid() {
        return braid;
    }

    public void setBraid(Integer braid) {
        this.braid = braid;
    }

    public Integer getWarehouseid() {
        return warehouseid;
    }

    public void setWarehouseid(Integer warehouseid) {
        this.warehouseid = warehouseid;
    }

    public Integer getLogisticid() {
        return logisticid;
    }

    public void setLogisticid(Integer logisticid) {
        this.logisticid = logisticid;
    }

    public Integer getProductnum() {
        return productnum;
    }

    public void setProductnum(Integer productnum) {
        this.productnum = productnum;
    }



    /**
	 * @return the totalprice
	 */
	public Float getTotalprice() {
		return totalprice;
	}

	/**
	 * @param totalprice the totalprice to set
	 */
	public void setTotalprice(Float totalprice) {
		this.totalprice = totalprice;
	}

	public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode == null ? null : barCode.trim();
    }

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "TOrder [id=" + id + ", orderuuid=" + orderuuid + ", nameofconsignee=" + nameofconsignee + ", address="
				+ address + ", consigneetelephone=" + consigneetelephone + ", orderstatus=" + orderstatus
				+ ", creationtime=" + creationtime + ", paytime=" + paytime + ", note=" + note + ", productid="
				+ productid + ", destinationcountryid=" + destinationcountryid + ", stoid=" + stoid + ", braid=" + braid
				+ ", warehouseid=" + warehouseid + ", logisticid=" + logisticid + ", productnum=" + productnum
				+ ", totalprice=" + totalprice + ", barCode=" + barCode + "]";
	}
    
    
}