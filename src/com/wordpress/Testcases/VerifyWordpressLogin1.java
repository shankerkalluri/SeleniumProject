package com.wordpress.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.wordpress.Pages.LoginPage;

public class VerifyWordpressLogin1 {
	
			
	@Test
	public void verifyValidLogin() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\E003801\\Downloads\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//driver.manage().window().maximize();
		driver.get("http://demosite.center/wordpress/wp-login.php");
		
		LoginPage login=new LoginPage(driver);
		
		login.loginToWordpress("admin", "demo123");
		
		Thread.sleep(5000);
		
		driver.quit();
	}

}
