package com.base;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Basetest {
	public WebDriver driver;
	static public String sDirPath=System.getProperty("user.dir");
	public ArrayList<String> DataSheetList ;
	public String testCaseName;	
	public GenericExcel generic;

	@BeforeClass 
	public void tearUp()
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/ServiceLogin?service=mail&passive=true&rm=false&continue=https://mail.google.com/mail/");	
	}
	
	@BeforeMethod
	public void preCondition()
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		DataSheetList =new ArrayList<String>();
		generic=new GenericExcel();
	}
	
	@AfterMethod
	public void postCondition()
	{
		
	}
	
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
	
	
	
}
