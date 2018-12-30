package com.google.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PreparationClass {
	public WebDriver driver;
	
	public WebDriver prepareEnvironment() {
		System.setProperty("webdriver.chrome.driver", "C:/soft/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}
}
