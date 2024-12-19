package com.program;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SONU KUMAR T\\eclipse-workspace\\Selenium_9am\\chromepath\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//WebElement a = driver.findElement(By.xpath("//a[text()='Facebook']"));
		//js.executeScript("arguments[0].scrollIntoView();", a);
//		js.executeScript("window.scrollBy(0, 4000)"); 
//		js.executeScript("window.scrollBy(0, -1000)");
		js.executeScript("alert('hi guys');");
	}
}
