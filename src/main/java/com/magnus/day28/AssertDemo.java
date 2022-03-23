package com.magnus.day28;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertDemo {

	WebDriver driver = null;

	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.citi.com/");
	}

	@Test
	public void verifyHomelendinglnk() {

		WebElement lendinglnk = driver.findElement(By.xpath("//a[@id='navlendingmainAnchor2']"));
		Actions Act = new Actions(driver);
		Act.moveToElement(lendinglnk).perform();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement Homelendinglink = driver.findElement(By.xpath("//a[@id='Home LendingchildLink1']"));
		Assert.assertTrue(Homelendinglink.isDisplayed());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@Test
	public void verifyinvestmentlnk() {
		WebElement investmentlnk = driver.findElement(By.xpath("//a[@id='investingmainAnchor3']"));
		Actions Act = new Actions(driver);
		Act.moveToElement(investmentlnk).perform();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement Roboadvisorlnk = driver.findElement(By.xpath("//a[@id='Robo AdvisorchildLink2']"));
		Assert.assertTrue(Roboadvisorlnk.isDisplayed());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@AfterTest
	public void dismiss() {
		driver.close();
		driver.quit();
	}

}
