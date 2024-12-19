package com.program;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtabless {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SONU KUMAR T\\eclipse-workspace\\Selenium_9am\\chromepath\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		driver.manage().window().maximize();
		
		//WebElement element = driver.findElement(By.xpath("//table/tbody/tr/td"));
		
//		List<WebElement> elements = driver.findElements(By.xpath("//table/tbody/tr[5]/td[4]"));
//		
//		for (WebElement alldata : elements) {
//			System.out.println(alldata.getText());
//		}
		
		
		WebElement element = driver.findElement(By.xpath("//table/tbody/tr[5]/td[4]"));
		System.out.println(element.getText());
		
	}

}
