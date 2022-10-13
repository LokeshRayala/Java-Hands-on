package com.simplilearn.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ChromeTest {
  
  
  WebDriver driver=null;

	@Test(groups = "Chrome")
	public void launchChrome() {
		System.setProperty("webdriver.chrome.driver", "E:\\Java FSD Phase-5\\All Downloads\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		long start = System.currentTimeMillis();
		driver.manage().window().maximize();
	    driver.get("http://localhost:4200/");
		long finish = System.currentTimeMillis();
		long totalTime = finish - start; 
		System.out.println("Total Time for main page load = "+(totalTime*0.001)+" Seconds"); 
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@BeforeMethod
	private void beforeMethod() {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Java FSD Phase-5\\All Downloads\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		
	}	

 @AfterMethod
 private void afterMethod() {
	// TODO Auto-generated method stub
	 driver=null;
	
}
	
	
	
	
}
