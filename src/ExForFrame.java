import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ExForFrame {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\e003801\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/selenium/guru99home/");
		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println("Number of frames in the webpage are:"+ size);
		driver.switchTo().frame("a077aa5e");
		System.out.println("Switched in to the frame");
		driver.findElement(By.xpath("//*[@src='Jmeter720.png']")).click();
		System.out.println("Clicked the frame");
		Thread.sleep(4000);
		driver.quit();
		
	}
}
