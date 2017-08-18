import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import com.gargoylesoftware.htmlunit.javascript.host.Set;

public class ExForHandlingWindows {
	
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\e003801\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");
		String handle= driver.getWindowHandle();
		System.out.println(handle);
		driver.findElement(By.xpath(".//*[@id='content']/p[3]/button")).click();
		Set handles = (Set) driver.getWindowHandles();
		System.out.println(handles);
		for (String handle1 : driver.getWindowHandles()) {
		 driver.switchTo().window(handle1);
		}
		driver.quit();
		
	}
}
