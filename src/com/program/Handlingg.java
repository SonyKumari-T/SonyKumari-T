package com.program;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Handlingg {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SONU KUMAR T\\eclipse-workspace\\Selenium_9am\\chromepath\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/windows");
		driver.manage().window().maximize();
		Thread.sleep(2000);
//		String windowHandle = driver.getWindowHandle();
//		System.out.println(windowHandle);

		driver.findElement(By.id("multi")).click();
		List<String> windowHandles = new ArrayList<String>(driver.getWindowHandles());
		for (String x : windowHandles) {
			System.out.println(x);
		}

		driver.switchTo().window(windowHandles.get(1));
        WebElement element = driver.findElement(By.id("fruits"));
		Select aSelect = new Select(element);
		aSelect.selectByIndex(2);

		String dropdown = driver.getWindowHandle();
		System.out.println("id of dropdown" +dropdown);
		
		
		driver.switchTo().window(windowHandles.get(2));
		WebElement element2 = driver.findElement(By.xpath("//h1[text()=' Alert']"));
		System.out.println(element2.getText());

		String alert = driver.getWindowHandle();
		System.out.println("id of alert"+alert);// 059B54AAB32ECD8F411F8A9E67CCE9B7

	}

}
