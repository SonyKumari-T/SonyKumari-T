package com.program;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class kKeyboardActions {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SONU KUMAR T\\eclipse-workspace\\Selenium_9am\\chromepath\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.id("APjFqb"));
		Actions a = new Actions(driver);
		a.click(element).build().perform();
		
		Robot b = new Robot();
		b.keyPress(KeyEvent.VK_F);
		b.keyRelease(KeyEvent.VK_F);
	b.keyPress(KeyEvent.VK_L);
		b.keyRelease(KeyEvent.VK_L);
		b.keyPress(KeyEvent.VK_O);
		b.keyRelease(KeyEvent.VK_O);
		b.keyPress(KeyEvent.VK_W);
		b.keyRelease(KeyEvent.VK_W);
		b.keyPress(KeyEvent.VK_E);
		b.keyRelease(KeyEvent.VK_E);
		b.keyPress(KeyEvent.VK_R);
		b.keyRelease(KeyEvent.VK_R);
		b.keyPress(KeyEvent.VK_ENTER);
		
		
	}

}
