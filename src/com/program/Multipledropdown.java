package com.program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multipledropdown {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SONU KUMAR T\\eclipse-workspace\\Selenium_9am\\chromedriver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://demoqa.com/select-menu");
	    driver.manage().window().maximize();
	    
	    WebElement element = driver.findElement(By.name("cars"));
	    Select a = new Select(element);
	    a.selectByIndex(0);
	    a.selectByIndex(1);
	    a.selectByIndex(3);
	  //  a.deselectAll();
//	    a.isMultiple();
	    System.out.println(a.isMultiple());
	}

}
