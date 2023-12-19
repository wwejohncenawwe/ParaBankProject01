package com.BankProject.TestRunnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/resources/Feature"},glue={"com.BankProject.StepDefinition","com.BankProject.HooksClass"},tags= ("@ParaBankTesting"),
                 dryRun=false,monochrome=true,plugin= {"pretty","html:Reports/Webreport.html","json:Reports/jsonreport.json","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"})
@Epic("ParaBank Epic 01")
@Feature("ParaBankTesting Feature")
@Story("ParaBank Story 01")
@Severity(SeverityLevel.NORMAL)
public class TestRunnerClass {

	
	
}
