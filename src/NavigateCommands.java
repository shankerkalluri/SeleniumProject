import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateCommands {
	
	public static void main(String args[]) throws InterruptedException{
	System.setProperty("webdriver.gecko.driver","C:\\Users\\E003801\\Downloads\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
		
	String appUrl = "http://www.DemoQA.com";
	driver.navigate().to(appUrl);
	Thread.sleep(2000);
	driver.manage().window().maximize();
	Thread.sleep(2000);
	// Click on Registration link
	driver.findElement(By.xpath(".//*[@id='menu-item-374']/a")).click();
	Thread.sleep(500);
	// Go back to Home Page
	driver.navigate().back();
	Thread.sleep(2000);
	// Go forward to Registration page
	driver.navigate().forward();
	Thread.sleep(2000);
	// Go back to Home page
	// Refresh browser
	driver.navigate().refresh();
	Thread.sleep(2000);
	// Close browser
	driver.close();
}
}