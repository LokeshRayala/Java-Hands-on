package com.testing;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;


public class FlipkartAutoTest {
	
	WebDriver driver;
	
	 @Test
	public void flipkart() throws Exception  {
		 

		 long start = System.currentTimeMillis();
		driver.get("https://www.flipkart.com/search");
		long finish = System.currentTimeMillis();
		long totalTime = finish - start; 
		System.out.println("Total Time for page load = "+(totalTime*0.001)+" Seconds"); 
		driver.findElement(By.name("q")).sendKeys("iPhone 13");
		driver.findElement(By.cssSelector("#container > div > div._1kfTjk > div._1rH5Jn > div._2Xfa2_ > div._1cmsER > form > div > button")).click();
		
		 Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		System.out.println("Reached Bottom of the page");
		

	      WebElement i = driver.findElement
	      (By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[25]/div/div/div/a/div[1]/div[1]/div/div/img"));
	   
	      Boolean k = (Boolean) ((JavascriptExecutor)driver) .executeScript("return arguments[0].complete " + "&& typeof arguments[0].naturalWidth != \"undefined\" " + "&& arguments[0].naturalWidth > 0", i);

	      if (k) {
	         System.out.println("Image loaded");
	      } else {
	         System.out.println("Image not loaded ");
	      }
		

		Thread.sleep(3000);
		driver.navigate().refresh();
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(2))
				.ignoring(NoSuchElementException.class);
		
		
		
		WebElement clickseleniumlink = wait.until(new Function<WebDriver, WebElement>(){
		
			@Test
			public WebElement apply(WebDriver driver ) {
			
				WebElement element= driver.findElement(By.cssSelector("#container > div > div._1kfTjk > div._1rH5Jn > div._2Xfa2_ > div.go_DOp._2errNR > div > div > div > a"));
				String getTextOnPage= element.getText();
				
				if(getTextOnPage.equals("Login")) {
					System.out.println("Successfully logged !!!");
					System.out.println("Passed");
					return element;
				}
				else {
					System.out.println("Element Not Loaded !!!");
					return null;
				}
				
				
			}
		});
		
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
	

