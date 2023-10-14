package com.it.bd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseHoverHandling extends BaseDriver{
	
	String url = "https://demo.nopcommerce.com/";
	
	@Test
	public void mouseHoverTest() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get(url);

		Actions action = new Actions(driver);
		
		WebElement homeAndLifestyle = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']"));
		action.moveToElement(homeAndLifestyle).perform();
		Thread.sleep(5000);
		
		WebElement cell = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Cell phones']"));
		cell.click();
		Thread.sleep(5000);
		
//		WebElement furniture = driver.findElement(By.xpath("//body/div[@id='J_7459419030']/div[@id='J_LzdSiteNav']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/ul[10]/li[3]/a[1]/span[1]"));
//		action.moveToElement(furniture).perform();
//		Thread.sleep(5000);
//		
//		WebElement livingRoom = driver.findElement(By.xpath("//span[contains(text(),'Living Room Furniture')]"));
//		livingRoom.click();
//		Thread.sleep(5000);
		
		
		
	}

}
