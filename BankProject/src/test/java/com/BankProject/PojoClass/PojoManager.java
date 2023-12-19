package com.BankProject.PojoClass;

import com.BankProject.BaseClass.BaseClass;

public class PojoManager extends BaseClass {


	Login_PojoClass log;
	Register_PojoClass reg;
	AccountOpen_PojoClass acc;
	ForgotLogin_PojoClass forg;

	public Login_PojoClass getlog() {
		return (log==null)? log=new Login_PojoClass(driver):log;

	}
	public Register_PojoClass getreg() {
		return (reg==null)? reg=new Register_PojoClass(driver):reg;

	}
	public AccountOpen_PojoClass getacc() {
		return (acc==null)? acc=new AccountOpen_PojoClass(driver):acc;

	}
	public ForgotLogin_PojoClass getforg() {
		return (forg==null)? forg=new ForgotLogin_PojoClass(driver):forg;
	}
}
