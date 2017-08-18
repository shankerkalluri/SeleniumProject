package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String args[]) throws InterruptedException{
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\E003801\\Downloads\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		String baseUrl = "http://newtours.demoaut.com/mercuryregister.php";
		driver.get(baseUrl);
		
		//Selecting DropDown
		
		Select drpDown = new Select(driver.findElement(By.name("country")));
		drpDown.selectByVisibleText("ARUBA");
		Thread.sleep(2000);
		
		//Multiple Selecting Elements
		
		driver.get("http://jsbin.com/osebed/2");
		Select fruits = new Select(driver.findElement(By.id("fruits")));
		fruits.selectByVisibleText("Grape");
		fruits.selectByIndex(0);
		driver.quit();
	}

}
