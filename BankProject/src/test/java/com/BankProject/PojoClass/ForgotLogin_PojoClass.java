package com.BankProject.PojoClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BankProject.BaseClass.BaseClass;

public class ForgotLogin_PojoClass extends BaseClass{

	public WebDriver ldriver;
	public ForgotLogin_PojoClass(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);	
	}

	@FindBy(linkText="Forgot login info?")
	private WebElement forgotloginlink;
	@FindBy(xpath="//div/h1/following::p[text()='Please fill out the following information in order to validate your account.']")
	private WebElement validatedetails;
	@FindBy(id="firstName")
	private WebElement firstname;
	@FindBy(id="lastName")
	private WebElement lastname;
	@FindBy(id="address.street")
	private WebElement address;
	@FindBy(id="address.city")
	private WebElement city;
	@FindBy(id="address.state")
	private WebElement state;
	@FindBy(id="address.zipCode")
	private WebElement pinno;
	@FindBy(id="ssn")
	private WebElement ssnno;
	@FindBy(xpath="//input[@value='Find My Login Info']")
	private WebElement findmylogin;
	
	public WebElement getForgotloginlink() {
		return forgotloginlink;
	}
	public WebElement getValidatedetails() {
		return validatedetails;
	}
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCity() {
		return city;
	}
	public WebElement getState() {
		return state;
	}
	public WebElement getPinno() {
		return pinno;
	}
	public WebElement getSsnno() {
		return ssnno;
	}
	public WebElement getFindmylogin() {
		return findmylogin;
	}



}
