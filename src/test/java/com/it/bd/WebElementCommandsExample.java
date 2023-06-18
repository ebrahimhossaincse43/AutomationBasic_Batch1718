package com.it.bd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebElementCommandsExample extends BaseDriver{
	
	String url = "https://demoqa.com/automation-practice-form";
	
	@Test
	public void webElementsTest() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get(url);
		
		WebElement firstName = driver.findElement(By.xpath("//input[@id='firstName']"));
		firstName.sendKeys("Ebrahim");
		Thread.sleep(3000);
		
//		WebElement dob = driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
//		dob.click();
//		Thread.sleep(3000);
		
		WebElement lastName = driver.findElement(By.xpath("//input[@id='lastName']"));
		lastName.clear();
		lastName.sendKeys("Hossain");
		Thread.sleep(3000);
		
		WebElement email = driver.findElement(By.xpath("//input[@id='userEmail']"));
//		System.out.println("Attribute Value: "+email.getAttribute("pattern"));
//		Thread.sleep(3000);
		
		WebElement text = driver.findElement(By.xpath("//h5[contains(text(),'Student Registration Form')]"));
		String formValue = text.getText();
		System.out.println(formValue);
		Thread.sleep(3000);
		
		System.out.println("Css Value: "+text.getCssValue("font-size"));
		System.out.println("Css Value: "+text.getCssValue("color"));
		
		if(email.isDisplayed()) {
			email.sendKeys("Test@noemail.com");
			Thread.sleep(3000);
		}else {
			System.out.println("Email address is not locateable.");
		}
		
		WebElement sports = driver.findElement(By.xpath("//label[contains(text(),'Sports')]"));
		
		if (!sports.isSelected()) {
			sports.click();
			Thread.sleep(3000);
		}else {
			System.out.println("Sports is already selected.");
		}
		
		
	}

}
