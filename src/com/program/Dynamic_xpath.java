package com.program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_xpath {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SONU KUMAR T\\eclipse-workspace\\Selenium_9am\\chromepath\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.flipkart.com/");
	    driver.findElement(By.name("q")).sendKeys("mobiles");
	    driver.findElement(By.cssSelector("svg[width='24']")).click();
//	    driver.findElement(By.className("EwE-Fa")).click();
////	    WebElement element = driver.findElement(By.xpath("//a[text()='POCO M6 Plus 5G (Misty Lavender, 128 GB)']/parent::div/parent::div/child::div[3]/child::div/child::div[@class=\"Nx9bqj\"]"));
//	System.out.println( element.getText());
	  //  element.getText();
	}

}
