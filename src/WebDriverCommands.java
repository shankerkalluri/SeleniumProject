import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverCommands {
	public static void main(String args[]){
		
	
	System.setProperty("webdriver.gecko.driver","C:\\Users\\E003801\\Downloads\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("http://www.store.demoqa.com");
	
	//Title of the web page
	
	System.out.println("Title is :"+driver.getTitle());
	
	System.out.println("Browser URL is :"+driver.getCurrentUrl());
	
	System.out.println("Page Source is :"+driver.getPageSource());
	driver.quit();
		
	}
}