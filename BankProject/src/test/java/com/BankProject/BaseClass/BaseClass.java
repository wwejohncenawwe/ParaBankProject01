package com.BankProject.BaseClass;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {

	ReadConfig read=new ReadConfig();

	public String browser=read.getBrowserName();
	public String browserlocation=read.getBrowserLocation();
	public String url=read.getApplicationUrl();
	public static WebDriver driver;
	public static Logger logger;  

	public void launchBrowser(String browser,String url) {
		logger=Logger.getLogger("ParaBank");
		PropertyConfigurator.configure("log4j.properties");
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+browserlocation);
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		logger.info("browser maximize done");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	public void quitBrowser() {
		if(driver!=null) {
//			driver.close();
			driver.quit();
		}
	}
	public void type(WebElement web,String text) {
		web.sendKeys(text);
	}
	public void btnClick(WebElement web) {
		web.click();
	}
	public String title(WebDriver driver) {
		String title=driver.getTitle();
		logger.info("pagetitle: "+title);
		return title;
	}
	public boolean pageSource(WebDriver driver,String text) {
		boolean source=driver.getPageSource().contains(text);
		logger.info("pagesource: "+source);
		return source;
	}
	public void webdriverClickWait(WebDriver driver,WebElement web) {
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(web));
	}
	public void fluentwait(WebDriver driver,WebElement web) {
		FluentWait<WebDriver> wait=new FluentWait<>(driver).withTimeout(20,TimeUnit.SECONDS).pollingEvery(Duration.ofSeconds(1)).ignoring(Throwable.class);
		wait.until(ExpectedConditions.elementToBeSelected(web));
	}
	public void moveToElement(WebDriver driver,WebElement web) {
		Actions action=new Actions(driver);
		action.moveToElement(web).click().build().perform();
	}
	public String attribute(WebElement web,String s) {
		return web.getAttribute(s);
	}
	public boolean text(WebElement web,String text) {
		boolean value=web.getText().contains(text);
		logger.info("pagetext: "+value);
		return value;
	}
	public boolean webelementDisplayed(WebElement webelement) {
		boolean value=webelement.isDisplayed();
		return value;
	}
	public void captureScreenshot1(WebDriver driver,String testname) {
		String timestamp=new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File target=new File(System.getProperty("user.dir")+"/Screenshot/"+timestamp+" "+testname+".png");
		try {
			FileUtils.copyFile(source, target);
			logger.info("screenshot capture succesfully stored in screenshot folder");
		} catch (IOException e) {
			e.printStackTrace();
			logger.info("not capture");
		}
	}
	public void captureScreenshot2(WebDriver driver,String testname) {
		Robot robot = null;
		try {
			robot=new Robot();
		} catch (AWTException e) {
			e.printStackTrace();
		}Dimension size=Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rec=new Rectangle(size);
		BufferedImage source=robot.createScreenCapture(rec);
		File target=new File(System.getProperty("user.dir")+"/Screenshot/"+testname+".png");
		try {
			ImageIO.write(source,"png",target);
			logger.info("screenshot capture succesfully stored in screenshot folder");
		} catch (IOException e) {
			e.printStackTrace();
			logger.info("not capture");
		}
	}
	public void visibleText(WebElement web,String text) {
		Select select=new Select(web);
		select.selectByVisibleText(text);
	}

}
