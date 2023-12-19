//package com.BankProject.StepDefinition;
//
//import static org.testng.Assert.assertTrue;
//
//import com.BankProject.BaseClass.BaseClass;
//import com.BankProject.PojoClass.Login_PojoClass;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.When;
//
//public class Login_StepDefinition extends BaseClass{
//
//	Login_PojoClass log=new Login_PojoClass(driver);
//	@Given("verify that user is on customer login page")
//	public void verify_that_user_is_on_customer_login_page() {
//		if(pageSource(driver,"Customer Login")) {
//			assertTrue(true);
//		}else {
//			assertTrue(false);
//		}
//	}
//
//	@When("user enter a valid username {string}")
//	public void user_enter_a_valid_username(String string) {
//		type(log.getUsername(), string);
//	}
//
//	@When("user enter a valid password {string}")
//	public void user_enter_a_valid_password(String string) {
//		type(log.getPassword(), string);
//	}
//
//	@When("user finally click on login button")
//	public void user_finally_click_on_login_button() {
//		btnClick(log.getLogin());
//	}
//
//	@When("verify that user can see the account balance page")
//	public void verify_that_user_can_see_the_account_balance_page() {
//		if( pageSource(driver,"Accounts Overview")) {
//			assertTrue(true);
//		}else {
//			assertTrue(false);
//		}
//	}
//
//}
