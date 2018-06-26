package com.ally.manager.pojo.my;

import java.math.BigDecimal;

public class MyTMoneyDetail {
	
	
	private String username;
	
	private BigDecimal totalMoney;
	
	private BigDecimal money;
	
	private int state;
	
	private int type;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public BigDecimal getTotalMoney() {
		return totalMoney;
	}

	public void setTotalMoney(BigDecimal totalMoney) {
		this.totalMoney = totalMoney;
	}

	public BigDecimal getMoney() {
		return money;
	}

	public void setMoney(BigDecimal money) {
		this.money = money;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}
	
	


	@Override
	public String toString() {
		return "MyTMoneyDetail [username=" + username + ", totalMoney=" + totalMoney + ", money=" + money + ", state="
				+ state + ", type=" + type + "]";
	}
	
	
}
