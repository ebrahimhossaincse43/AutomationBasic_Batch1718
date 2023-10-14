package com.it.bd;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class IFrameHandling extends BaseDriver{
	
	String url ="https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html";
	
	@Test
	public void testWaits() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get(url);
		
		int iframeNumber = driver.findElements(By.tagName("iframe")).size();
		System.out.println(iframeNumber);
		
		driver.switchTo().frame("packageListFrame");
		WebElement selenium = driver.findElement(By.xpath("//body/main[1]/ul[1]/li[1]/a[1]"));
		selenium.click();
		Thread.sleep(5000);
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("packageFrame");
		WebElement alert = driver.findElement(By.xpath("//span[contains(text(),'Alert')]"));
		alert.click();
		Thread.sleep(5000);
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("classFrame");
		WebElement accept = driver.findElement(By.xpath("//a[contains(text(),'accept')]"));
		accept.click();
		Thread.sleep(5000);
		
		driver.switchTo().defaultContent();
		
		
	}

}
