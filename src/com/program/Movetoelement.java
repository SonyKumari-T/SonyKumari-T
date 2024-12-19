package com.program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Movetoelement {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SONU KUMAR T\\eclipse-workspace\\Selenium_9am\\chromepath\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.myntra.com/");
	    driver.manage().window().maximize();
	    WebElement element = driver.findElement(By.xpath("(//a[text()='Women'])[1]"));
	    Actions actions = new Actions(driver);
	    actions.moveToElement(element).build().perform();
	WebElement element2 = driver.findElement(By.xpath("//a[text()='Sarees']"));
	actions.click(element2).build().perform();
	}

}
