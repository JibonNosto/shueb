package com.home.work;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CookiesOperation {
	
	@Test
	public void deleteAllTheCookies() {
		

	    System.setProperty("webdriver.chrome.driver", "/Users/mac/Downloads/chromedriver/");	
		
	    WebDriver dr = new ChromeDriver();
		          dr.get("https://www.jcpenney.com/");
		          
		          Set<Cookie> allCookies = dr.manage().getCookies();
		          
		          //cookies count
		          System.out.println("get the cookie count ="+ allCookies.size() );
		 
		        
		          for (Cookie cookie : allCookies) {
		        	  
		        	  System.out.println("Name = "+ cookie.getName());
		        	  System.out.println("Domain = "+ cookie.getDomain());
		        	  System.out.println("VAlue = "+ cookie.getValue());
		        	  System.out.println("Path = "+ cookie.getPath());
					  System.out.println("====================================");
				}
		 
		         dr.manage().deleteAllCookies();
		          
		         Set<Cookie> cookies =  dr.manage().getCookies();
		         
		         System.out.println("cookies count = "+ cookies.size());
		         
		         
	}

}
