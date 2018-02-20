package com.acc;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class SimpleTest {
	
	private WebDriver driver;
	
	@Before
	public void setup(){
		 System.setProperty("webdriver.chrome.driver", "chromedriver");
		driver = new ChromeDriver();
		
	}
	
	@After
	public void trminate(){
		
		//driver.quit();
		
	}
	
	@Test
	public void StartTest(){
		
		driver.navigate().to("https://www.youtube.com/");
		
	}

}
