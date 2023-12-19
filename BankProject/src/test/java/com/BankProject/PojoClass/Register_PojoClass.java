package com.BankProject.PojoClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BankProject.BaseClass.BaseClass;

public class Register_PojoClass  extends BaseClass{

	public WebDriver ldriver;
	public Register_PojoClass(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(xpath="//h2[text()='Customer Login']")
	private WebElement customerlogin;
	@FindBy(xpath="//a[text()='Register']")
	@CacheLookup
	private WebElement register;
	@FindBy(xpath="//h1[text()='Signing up is easy!']")
	private WebElement signupform;
	@FindBy(xpath="//input[@name='customer.firstName']")
	@CacheLookup
	private WebElement firstname;
	@FindBy(id="customer.lastName")
	@CacheLookup
	private WebElement lastname;
	@FindBy(id="customer.address.street")
	@CacheLookup
	private WebElement address;
	@FindBy(id="customer.address.city")
	@CacheLookup
	private WebElement city;
	@FindBy(id="customer.address.state")
	@CacheLookup
	private WebElement state;
	@FindBy(id="customer.address.zipCode")
	@CacheLookup
	private WebElement pincode;
	@FindBy(id="customer.phoneNumber")
	@CacheLookup
	private WebElement phoneno;
	@FindBy(id="customer.ssn")
	@CacheLookup
	private WebElement ssnno;
	@FindBy(id="customer.username")
	@CacheLookup
	private WebElement username;
	@FindBy(id="customer.password")
	@CacheLookup
	private WebElement password;
	@FindBy(id="repeatedPassword")
	@CacheLookup
	private WebElement confirmpass;
	@FindBy(xpath="//td/input[@type='submit']")
	@CacheLookup
	private WebElement registerbtn;
	@FindBy(xpath="//div[@id='rightPanel']/p[text()='Your account was created successfully. You are now logged in.']")
	private WebElement verifyregister;
	
	public WebElement getCustomerlogin() {
		return customerlogin;
	}
	public WebElement getRegister() {
		return register;
	}
	public WebElement getSignupform() {
		return signupform;
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
	public WebElement getPincode() {
		return pincode;
	}
	public WebElement getPhoneno() {
		return phoneno;
	}
	public WebElement getSsnno() {
		return ssnno;
	}
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getConfirmpass() {
		return confirmpass;
	}
	public WebElement getRegisterbtn() {
		return registerbtn;
	}
	public WebElement getVerifyregister() {
		return verifyregister;
	}

	
	
}
