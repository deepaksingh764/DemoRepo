package com.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.qa.base.TestBase;

public class TestCases extends TestBase {

	com.qa.pages.LoginPage loginpage;
	
	@BeforeMethod
	
	public void setup() {
		
		initialization();
		loginpage = new com.qa.pages.LoginPage();		
	} 
	
	@Test
	public void getTitle() {
		
	String title =	loginpage.validatePageTitle();
System.out.println(title);
	}
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
		
	}
	
}
