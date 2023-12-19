//package com.BankProject.StepDefinition;
//
//import static org.testng.Assert.assertTrue;
//
//import com.BankProject.BaseClass.BaseClass;
//import com.BankProject.PojoClass.Register_PojoClass;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class Register_StepDefinition extends BaseClass {
//
//	Register_PojoClass reg=new Register_PojoClass(driver);
//	@Given("verify that user is on para bank customer login page")
//	public void verify_that_user_is_on_para_bank_customer_login_page() {
//		
//		if(text(reg.getCustomerlogin(),"Customer Login")) {
//			assertTrue(true);
//		}else {
//			assertTrue(false);
//		}
//	}
//
//	@When("user click on register link")
//	public void user_click_on_register_link() {
//		btnClick(reg.getRegister());
//	}
//
//	@Then("user can see the signup register form")
//	public void user_can_see_the_signup_register_form() {
//		if(pageSource(driver,"Signing up is easy!")) {
//			assertTrue(true);
//		}else {
//			assertTrue(false);
//		}		  
//	}
//
//	@When("user enter a valid firstname as {string}")
//	public void user_enter_a_valid_firstname_as(String string) {
//		type(reg.getFirstname(), string);
//	}
//
//	@When("user enter a valid lastname as {string}")
//	public void user_enter_a_valid_lastname_as(String string) {
//		type(reg.getLastname(), string);
//	}
//
//	@When("user enter a valid address as {string}")
//	public void user_enter_a_valid_address_as(String string) {
//		type(reg.getAddress(), string);
//	}
//
//	@When("user enter a valid city as {string}")
//	public void user_enter_a_valid_city_as(String string) {
//		type(reg.getCity(), string);
//	}
//
//	@When("user enter a valid state as {string}")
//	public void user_enter_a_valid_state_as(String string) {
//		type(reg.getState(), string);
//	}
//
//	@When("user enter a valid pincode as {string}")
//	public void user_enter_a_valid_pincode_as(String string) {
//		type(reg.getPincode(), string);
//	}
//
//	@When("user enter a valid phoneno as {string}")
//	public void user_enter_a_valid_phoneno_as(String string) {
//		type(reg.getPhoneno(), string);
//	}
//
//	@When("user enter a valid ssnno as {string}")
//	public void user_enter_a_valid_ssnno_as(String string) {
//		type(reg.getSsnno(), string);
//	}
//
//	@Then("user enter a valid username as {string}")
//	public void user_enter_a_valid_username_as(String string) {
//		type(reg.getUsername(), string);
//	}
//
//	@Then("user enter a valid password as {string}")
//	public void user_enter_a_valid_password_as(String string) {
//		type(reg.getPassword(), string);
//	}
//
//	@Then("user enter a valid confirmpass as {string}")
//	public void user_enter_a_valid_confirmpass_as(String string) {
//		type(reg.getConfirmpass(), string);
//	}
//
//	@Then("user finally click on register button")
//	public void user_finally_click_on_register_button() {
//		btnClick(reg.getRegisterbtn());
//	}
//
//
//
//
//}
