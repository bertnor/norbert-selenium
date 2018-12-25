package com.google.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GoogleHomePageTest {
	
	private WebDriver driver; 
	String appURL = "http://google.com";

	@BeforeClass
	public void testSetUp() {
		System.setProperty("webdriver.chrome.driver", "C:/soft/drivers/chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void verifyGooglePageTittle() {
		System.out.println("siema");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		driver.navigate().to(appURL);
		String getTitle = driver.getTitle();
		Assert.assertEquals(getTitle, "Google");
		driver.findElement(By.name("q")).sendKeys("unia tarnow");
		driver.findElement(By.name("btnK")).click();
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		Assert.assertTrue(driver.getPageSource().contains("unia"), "Unia is on results");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
}