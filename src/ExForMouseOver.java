import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ExForMouseOver {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\E003801\\Downloads\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement element = driver.findElement(By.xpath("//a[@title='Electronics']"));
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		System.out.println("Selected Electronics Category");
		WebElement subelement = driver.findElement(By.xpath("//a[@title='Motorola']"));
		action.moveToElement(element).moveToElement(subelement).click().build().perform();
		Thread.sleep(2000);
		System.out.println("Selected Motorola mobile");
		driver.close();
		
		}
}
