package com.crm.bit.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.base.TestBase;
import com.crm.bit.pages.HomePage;
import com.crm.bit.pages.LoginPage;

public class LoginPageTest extends TestBase {
	
	LoginPage loginPage;
	
	HomePage homePage;
	
	
	 public LoginPageTest() {
			
			super();
			
		}
	
	
	@BeforeMethod
	public void setUp() 
	{
		
		Initialization();
		
		
		loginPage = new LoginPage();
		
		
	}

	@Test(priority=1)
	public void loginPgeTitleTest() {
		
		String title = loginPage.validatePageTitle();		
	    Assert.assertEquals(title, "CRMPRO  - CRM software for customer relationship management, sales, and support.");
	}	
	@Test(priority=2)
	public void crmImagetest() {
		
		boolean flag = loginPage.validateCrmLogo();
		Assert.assertTrue(flag);
		
	}
	
	@Test(priority=3)
	public void loginTest() {
		
		homePage = loginPage.logIn(prop.getProperty("username"), prop.getProperty("password"));
		// this login method returning you the HomePage class object,so im storing them in homePage class reference.
		
	}
	
	@AfterMethod
	public void tearDown() {
		
		
		dr.quit();
	}

}
