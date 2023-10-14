package com.it.bd;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class WaitExamples extends BaseDriver{
	
	String url ="https://www.selenium.dev/";
	
	@Test
	public void testWaits() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get(url);
		//Implicit wait 
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		//explicit wait
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		WebElement blog = (WebElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Blog')]")));
		
		blog.click();
		
		Thread.sleep(3000);
	}

}
