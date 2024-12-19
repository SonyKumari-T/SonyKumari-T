package com.program;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SONU KUMAR T\\eclipse-workspace\\Selenium_9am\\chromedriver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.facebook.com/");  
	    driver.manage().window().maximize();
	    
	    TakesScreenshot a = (TakesScreenshot) driver;//narrowing casting
	    File src = a.getScreenshotAs(OutputType.FILE);
	    File destinationFile = new File("C:\\Users\\SONU KUMAR T\\eclipse-workspace\\Selenium_9am\\Screenshot\\fb.png");
	    FileHandler.copy(src, destinationFile);
	}

}
