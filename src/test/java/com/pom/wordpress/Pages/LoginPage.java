package com.pom.wordpress.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/** 
 * This class will store all the locators and methods of login page
 * @author bokwa
 *
 */
public class LoginPage {

	WebDriver driver;
	
	By username = By.id("user_login");
	By password = By.xpath(".//*[@id='user_pass']");
	By loginButton = By.name("wp-submit");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void typeUsername(String uid) {
		driver.findElement(username).sendKeys(uid);
	}
	
	public void typePassword(String pass) {
		driver.findElement(password).sendKeys(pass);
	}
	
	public void clickLogin() {
		driver.findElement(loginButton).click();
	}
}
