package com.google.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GoogleHomePageTest {
	
	private WebDriver driver; 
	private WebDriverWait wait = new WebDriverWait(driver, 5);
	String appURL = "http://google.com";

	@BeforeClass
	public void testSetUp() {
		System.setProperty("webdriver.chrome.driver", "C:/soft/drivers/chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void verifyGooglePageTittle() {
		driver.navigate().to(appURL);
		String getTitle = driver.getTitle();
		Assert.assertEquals(getTitle, "Google");
		driver.findElement(By.name("q")).sendKeys("unia tarnow");
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name("btnK"))));
		driver.findElement(By.name("btnK")).click();
		Assert.assertTrue(driver.getPageSource().contains("unia"), "Unia is on results");
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
}