package com.it.bd;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ScrollHandling extends BaseDriver {

	String url = "https://www.amazon.com/";

	@Test
	public void scrollTest() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get(url);
	
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//Scroll Down - Bottom
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(5000);
		
		//Scroll Up - Top
		js.executeScript("window.scrollTo(0,0)");
		Thread.sleep(5000);
		
		//Specific location
		WebElement location1 = driver.findElement(By.xpath("//span[contains(text(),'Top Sellers in Books for you')]"));	
		js.executeScript("arguments[0].scrollIntoView(true);", location1);
		Thread.sleep(5000);
	}

}
