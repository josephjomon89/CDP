package com.magnus.day26;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReportingDemo {
	WebDriver driver = null;
	
	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
	}

	@Test
	public void performGoogleSearch() throws InterruptedException {
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone14" + Keys.ENTER);
		Thread.sleep(2000);
		Reporter.log("Completed Google Search for Iphome 14");
	}
	
	@Test
	public void performWikiSearch() throws InterruptedException {
		driver.get("https://en.wikipedia.org/wiki/Main_Page");
		driver.findElement(By.xpath("//input[@name='search']")).sendKeys("iphone14" + Keys.ENTER);
		Thread.sleep(2000);
		Reporter.log("Completed Wiki Search for Iphome 14");
		
	
	}
	@AfterTest
	public void dismiss() {
		driver.close();
		driver.quit();
	}
}
