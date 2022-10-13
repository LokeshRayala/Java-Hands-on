package com.simplilearn.demo;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class LoginTest {
  
  
  WebDriver driver;
	@Test
	public void user() throws InterruptedException {
		
		driver.get("http://localhost:4200/user");

		driver.findElement(By.cssSelector("#exampleInputEmail1")).sendKeys("user");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#exampleInputPassword1")).sendKeys("user");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("body > app-root > app-user-login > div > form > div.text-center > button")).submit();	
		
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
