package com.home.work;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class DragAndDropConcept {
	
	
	@Test
	public void dragAndDrop() {
		
        System.setProperty("webdriver.chrome.driver", "/Users/mac/Downloads/chromedriver/");	
		
	    WebDriver dr = new ChromeDriver();
		          
	              dr.get("http://jqueryui.com/droppable/");
		          
		          dr.switchTo().frame(0);
		          
		          WebElement sourceElement = dr.findElement(By.id("draggable"));
		          
		          WebElement targetElement = dr.findElement(By.id("droppable"));
		          
		          Actions action = new Actions(dr);
		          
		          action.clickAndHold(sourceElement).moveToElement(targetElement).release().build().perform();
		          
		          
		        		  
		
	}

}
