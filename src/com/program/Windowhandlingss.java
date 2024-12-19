package com.program;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandlingss {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SONU KUMAR T\\eclipse-workspace\\Selenium_9am\\chromepath\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/windows");
		driver.manage().window().maximize();

		String windowHandle = driver.getWindowHandle();//id
		System.out.println("home page" + windowHandle);

//		driver.findElement(By.id("multi")).click();
//
//		// Set<String> windowHandles = driver.getWindowHandles();
//		// System.out.println(windowHandles);
//
//		List<String> list = new ArrayList<String>(driver.getWindowHandles());
//		System.out.println(list);
//
//		driver.switchTo().window(list.get(1));
//		String windowHandle2 = driver.getWindowHandle();
//		System.out.println("after switching" + windowHandle2);

	}

}
