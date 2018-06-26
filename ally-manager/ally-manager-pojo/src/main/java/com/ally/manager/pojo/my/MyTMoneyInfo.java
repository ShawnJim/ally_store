package com.ally.manager.pojo.my;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 钱包审核信息
 * @author Administrator
 *
 */
public class MyTMoneyInfo {
	
	private Integer moneyId;
	
	private String number;

    private BigDecimal money;
    
    private String username;
    
    private Date time;
    
    private String adminName;
    
    private Date audittime;
    
    private Integer type;

    private Integer state;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public BigDecimal getMoney() {
		return money;
	}

	public void setMoney(BigDecimal money) {
		this.money = money;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public Date getAudittime() {
		return audittime;
	}

	public void setAudittime(Date audittime) {
		this.audittime = audittime;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public Integer getMoneyId() {
		return moneyId;
	}

	public void setMoneyId(Integer moneyId) {
		this.moneyId = moneyId;
	}
    
    
}
