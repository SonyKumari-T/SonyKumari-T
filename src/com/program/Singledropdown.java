package com.program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Singledropdown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SONU KUMAR T\\eclipse-workspace\\Selenium_9am\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		WebElement a = driver.findElement(By.id("day"));
		Select b= new Select(a);
		b.selectByIndex(2);
		
		WebElement a2 = driver.findElement(By.id("month"));	
		Select b2 = new Select(a2);
		b2.selectByValue("3");
		
		WebElement a3 = driver.findElement(By.id("year"));
		Select b3 = new Select(a3);
		b3.selectByVisibleText("2000");
		
	}

}
