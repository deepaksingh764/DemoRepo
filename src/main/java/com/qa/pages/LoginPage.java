package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	@FindBy(name = "username")
    WebElement username;
	
	@FindBy(name ="password")
	WebElement password;
	
	
	//Initializing the Page Objects:
		public LoginPage(){
			PageFactory.initElements(driver, this);
		}
		
		//Actions
		public String validatePageTitle() {
			
			return driver.getTitle();
			}
}
