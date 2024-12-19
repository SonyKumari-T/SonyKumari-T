package com.program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_selector {
	
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\SONU KUMAR T\\eclipse-workspace\\Selenium_9am\\chromepath\\chromedriver.exe");
		
	    WebDriver driver = new ChromeDriver();
	    
	    driver.get("https://www.facebook.com/");
	    
	    driver.manage().window().maximize();
	    
	    driver.findElement(By.cssSelector("#email")).sendKeys("sdfghsgmail.com");
	    
	    driver.findElement(By.cssSelector("[data-testid='royal_pass']")).sendKeys("2345678");
	    
	    driver.findElement(By.cssSelector(".selected ")).click();
	}

}
