package com.yash.demohiber;

import javax.persistence.Entity;

@Entity
public class EmpAddress 
{
	String currentaddress;
	public String getCurrentaddress() {
		return currentaddress;
	}
	public void setCurrentaddress(String currentaddress) {
		this.currentaddress = currentaddress;
	}
	public String getPermanentaddress() {
		return permanentaddress;
	}
	public void setPermanentaddress(String permanentaddress) {
		this.permanentaddress = permanentaddress;
	}
	String permanentaddress;
	

}
