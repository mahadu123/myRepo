package com.module;

public class Account {
	private long AccountNo;
	private String  AccountHolderName;
	private String Address;
	private long MobNo;
	private String PanNo;
	private int SetPassword;
	private long AadharNo;
	private double AmmountDeposit;
	private double AmmountWithdrawl;
	public long getAccountNo() {
		return AccountNo;
	}
	public void setAccountNo(long accountNo) {
		AccountNo = accountNo;
	}
	public String getAccountHolderName() {
		return AccountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		AccountHolderName = accountHolderName;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public long getMobNo() {
		return MobNo;
	}
	public void setMobNo(long mobNo) {
		MobNo = mobNo;
	}
	public String getPanNo() {
		return PanNo;
	}
	public void setPanNo(String panNo) {
		PanNo = panNo;
	}
	public long getAadharNo() {
		return AadharNo;
	}
	public void setAadharNo(long aadharNo) {
		AadharNo = aadharNo;
	}
	public double getAmmountDeposit() {
		return AmmountDeposit;
	}
	public void setAmmountDeposit(double ammountDeposit) {
		AmmountDeposit = ammountDeposit;
	}
	public double getAmmountWithdrawl() {
		return AmmountWithdrawl;
	}
	public void setAmmountWithdrawl(double ammountWithdrawl) {
		AmmountWithdrawl = ammountWithdrawl;
	}
	public int getSetPassword() {
		return SetPassword;
	}
	public void setSetPassword(int setPassword) {
		SetPassword = setPassword;
	}
	

}
