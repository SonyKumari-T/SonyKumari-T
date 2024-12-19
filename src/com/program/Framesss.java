package com.program;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framesss {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SONU KUMAR T\\eclipse-workspace\\Selenium_9am\\chromepath\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/frame");
		driver.manage().window().maximize();
		driver.switchTo().frame("firstFr");
		driver.findElement(By.name("fname")).sendKeys("kalai");
		driver.findElement(By.name("lname")).sendKeys("selvi");
		driver.switchTo().frame(1);
		driver.findElement(By.name("email")).sendKeys("sonyasdfg@gmail.com");
		driver.switchTo().parentFrame();
		driver.findElement(By.name("fname")).sendKeys("kalai asdfgh");
		driver.switchTo().defaultContent();
		WebElement element = driver.findElement(By.xpath("//h1[text()=' Frame']"));
		System.out.println(element.getText());

// driver.findElement(By.tagName("iframe"));

		List<WebElement> totalframes = driver.findElements(By.tagName("iframe"));
		int size = totalframes.size();
		System.out.println(size);

	}

}
