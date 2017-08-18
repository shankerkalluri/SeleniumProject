package FacebookDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class FacebookRegistration {
	
	public static void main(String args[]) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\E003801\\Downloads\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.facebook.com");
		driver.findElement(By.xpath("//input[@id='u_0_4']")).sendKeys("Testing Selenium");
		driver.findElement(By.xpath("//input[@id='u_0_2']")).click();
		
		Select sel1 = new Select(driver.findElement(By.xpath("//*[@id='month']")));
		sel1.selectByVisibleText("Sept");
		
		Select sel2 = new Select(driver.findElement(By.xpath("//*[@id='day']")));
		sel2.selectByValue("6");
		
		Select sel3 = new Select(driver.findElement(By.xpath("//*[@id='year']")));
		sel3.selectByIndex(6);
		
		driver.findElement(By.xpath("//button[@id='u_0_m']")).click();
		driver.findElement(By.xpath("//a[@href='/pages/create/?ref_type=registration_form']")).click();
		driver.navigate().back();
		driver.quit();
		
	}
}
