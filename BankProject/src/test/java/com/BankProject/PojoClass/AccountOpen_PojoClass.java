package com.BankProject.PojoClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BankProject.BaseClass.BaseClass;

public class AccountOpen_PojoClass  extends BaseClass{

	public WebDriver ldriver;
	public AccountOpen_PojoClass(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);;
	}
	
	@FindBy(xpath="//a[text()='Open New Account']")
	@CacheLookup
	private WebElement opennewaccount;
	@FindBy(xpath="//select[@id='type']")
	@CacheLookup
	private WebElement accounttype;
	@FindBy(xpath="//input[@class='button']")
	@CacheLookup
	private WebElement btnclick;
	@FindBy(xpath="//h1[@class='title']")
	@CacheLookup
	private WebElement accountopened;
	@FindBy(xpath="//a[@id='newAccountId']")
	@CacheLookup
	private WebElement accountno;
	public WebElement getOpennewaccount() {
		return opennewaccount;
	}
	public WebElement getAccounttype() {
		return accounttype;
	}
	public WebElement getBtnclick() {
		return btnclick;
	}
	public WebElement getAccountopened() {
		return accountopened;
	}
	public WebElement getAccountNo() {
		return accountno;
	}
}
