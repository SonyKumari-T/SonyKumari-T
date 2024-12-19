package com.program;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Lauch {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SONU KUMAR T\\eclipse-workspace\\Selenium_9am\\chromepath\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.facebook.com/");
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.className("gLFyf"));
		String searchKeyword = "site:*/contact";
		element.sendKeys(searchKeyword);
		
		Thread.sleep(2000);
		element.submit();
		
		
		TakesScreenshot a = (TakesScreenshot) driver;//takesScreenshot is an interface
		File src =a.getScreenshotAs(OutputType.FILE);//File is an class,src and dest --ref name
		String sanitizedFileName = searchKeyword.replaceAll("[^a-zA-Z0-9]", "_");
		File dest = new File("C:\\Users\\SONU KUMAR T\\eclipse-workspace\\Selenium_9am\\Screenshot_1\\" + sanitizedFileName + ".png");
		 
		FileHandler.copy(src, dest);
		
//		Thread.sleep(2000);
		//task---minimize
		
		//getmethods---getTitle and get currenturl
		
//		System.out.println(driver.getTitle());
//		System.out.println(driver.getCurrentUrl());
//		//driver.close();
//		//driver.quit();
//		//navigate methods
//		Navigation navigate = driver.navigate();
//		navigate.to("https://www.facebook.com/");
//		Thread.sleep(2000);
//		navigate.back();
//		Thread.sleep(2000);
//		navigate.forward();
//		Thread.sleep(2000);
//		navigate.refresh();
		
	}

}
