package FacebookDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WordPress {
	public static void main(String args[]){
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\E003801\\Downloads\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://demosite.center/wordpress/wp-login.php");
		
		driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='user_pass']")).sendKeys("demo123");
		driver.findElement(By.xpath("//input[@id='wp-submit']")).click();
		driver.quit();
	}
}
