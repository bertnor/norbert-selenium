package com.pom.wordpress.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.pom.wordpress.Pages.LoginPage;

/**
 * 
 * @author bokwa
 *
 */
public class VerifyWordpressLoginTest {

	private String username = "admin";
	private String password = "demo123";
	@Test
	public void verifyValidLogin() {
		System.setProperty("webdriver.chrome.driver", "C:/soft/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demosite.center/wordpress/wp-login.php");
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.typeUsername(username);
		loginPage.typePassword(password);
		loginPage.clickLogin();
		driver.quit();
	}
	
}
