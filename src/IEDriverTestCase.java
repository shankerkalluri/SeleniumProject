import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class IEDriverTestCase {
	public static void main(String args[]) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.ie.driver","C:\\Users\E003801\\Downloads\\IEDriverServer.exe");
		InternetExplorerDriver driver = new InternetExplorerDriver();
		
		driver.get("http://yahoo.com");
		
		System.out.println("Successfully opened the wesite");
		
		Runtime.getRuntime().exec("taskkill /F /IM iexplore.exe");
		driver.quit();
	}
}