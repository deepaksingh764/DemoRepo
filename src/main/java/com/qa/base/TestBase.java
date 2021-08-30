package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class TestBase {
 public static WebDriver driver;
 public static Properties prop;
	
	public TestBase() {
		
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("C:\\Users\\DELL\\Desktop\\Deepak\\Practice\\src"
					+ "\\main\\java\\com\\qa\\config\\config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}}
		
		public static void initialization() {
			
			String browsername = prop.getProperty("browser");
			if (browsername.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\setup\\chromedriver.exe");
				driver = new ChromeDriver();
				}

			else if (browsername.equalsIgnoreCase("ff")) {
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL\\Downloads\\setup\\geckodriver.exe");
				driver = new FirefoxDriver();
			}
			
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get(prop.getProperty("url"));
		}
	
		
	}
	

