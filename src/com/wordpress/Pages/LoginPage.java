/**
 * 
 */
package com.wordpress.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author E003801
 *This class will store all the locator and methods of login page
 */
public class LoginPage {
	
	WebDriver driver;
	
	By username =By.id("user_login"); 
	By password =By.xpath("//input[@id='user_pass']");
	By loginButton =By.name("wp-submit");
	
	public LoginPage(WebDriver driver)
	{
		
		this.driver=driver;
	}
	
	//login to wordpress but different way
	
	public void loginToWordpress(String userid, String pass)
	{
		driver.findElement(username).sendKeys(userid);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(loginButton).click();
	}
	
	//login to wordpress but different way above
	
	public void typeUserName()
	{
		driver.findElement(username).sendKeys("admin");
	}
	
	public void typePassword()
	{
		driver.findElement(password).sendKeys("demo123");
	}
	
	public void clickOnLoginButton()
	{
		driver.findElement(loginButton).click();
	}
}
