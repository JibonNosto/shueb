package com.crm.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.crm.utill.TestUtill;

public class TestBase {
	
	public static WebDriver dr;
	public static Properties prop;
	
	
	public TestBase() 
	{
		
		prop = new Properties();
		 try {
			FileInputStream ip = new FileInputStream(System.getProperty("/Users/mac/eclipse-workspace/CRM_PageObjectModel/"
					+ "src/main/java/com/crm/config/config.properties"));
			
			prop.load(ip);
			 
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	
	public static void Initialization()
	{
		
		String browserName = prop.getProperty("browser");
		
		
		if(browserName.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "/Users/mac/Downloads/chromedriver/");

			dr = new ChromeDriver();
			
			
		}
		else if (browserName.equals("ff")) {
			
			System.setProperty("webdriver.gecko.driver", "/Users/mac/Downloads/geckodriver/");
		     dr = new FirefoxDriver();
		
		}
		
		dr.manage().deleteAllCookies();
		dr.manage().timeouts().pageLoadTimeout(TestUtill.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		dr.manage().timeouts().implicitlyWait(TestUtill.IMPLECIT_WAIT, TimeUnit.SECONDS);
		
		dr.get(prop.getProperty("url"));
		
	}
	
	

}
