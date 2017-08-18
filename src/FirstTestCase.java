import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTestCase {

	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\E003801\\Downloads\\chrome.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.store.demoqa.com");
		
		System.out.println("Successfully opened the wesite");
		
		Thread.sleep(100);
		
		driver.quit();
	}
}

