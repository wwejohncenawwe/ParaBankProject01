package com.BankProject.PojoClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BankProject.BaseClass.BaseClass;

public class Login_PojoClass extends BaseClass {

	public WebDriver ldriver;
	public Login_PojoClass(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}


	@FindBy(xpath="//input[@name='username']")
	@CacheLookup
	private WebElement username;
	@FindBy(xpath="//input[@name='password']")
	@CacheLookup
	private WebElement password;
	@FindBy(xpath="//input[@type='submit']")
	@CacheLookup
	private WebElement login;
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLogin() {
		return login;
	}
	
}
