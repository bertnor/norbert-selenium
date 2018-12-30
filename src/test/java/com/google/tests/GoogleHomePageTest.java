package com.google.tests;

import static com.jayway.restassured.RestAssured.given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.util.PreparationClass;

public class GoogleHomePageTest {
	
	private WebDriver driver; 
	private WebDriverWait wait;
	
	String appURL = "http://google.com";

	@BeforeClass
	public void testSetUp() {
		
	}
	
	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "C:/soft/drivers/chromedriver.exe");
		driver = new ChromeDriver();
	    wait = new WebDriverWait(driver, 5);
	}
	
	@AfterTest
	public void afterTest() {
		driver.quit();
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
		given().when().get("http://www.google.com").then().statusCode(200);
	}
	@Test
	public void verifyGooglePageTittle1() {
		driver.navigate().to(appURL);
		String getTitle = driver.getTitle();
		Assert.assertEquals(getTitle, "Google");
		driver.findElement(By.name("q")).sendKeys("unia tarnow");
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name("btnK"))));
		driver.findElement(By.name("btnK")).click();
		Assert.assertTrue(driver.getPageSource().contains("unia"), "Unia is on results");
		given().when().get("http://www.google.com").then().statusCode(200);
	}
	@Test
	public void verifyGooglePageTittle2() {
		driver.navigate().to(appURL);
		String getTitle = driver.getTitle();
		Assert.assertEquals(getTitle, "Google");
		driver.findElement(By.name("q")).sendKeys("unia tarnow");
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name("btnK"))));
		driver.findElement(By.name("btnK")).click();
		Assert.assertTrue(driver.getPageSource().contains("unia"), "Unia is on results");
		given().when().get("http://www.google.com").then().statusCode(200);
	}
	
}