import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExForNavigationCommands {
	
	public static void main(String[] args) {
		System.out.println("Launching chrome Browser");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\e003801\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS );
		String appUrl = "http://www.facebook.com";
		driver.get(appUrl);
		driver.findElement(By.xpath("//*[@href='https://www.facebook.com/recover/initiate?lwv=110']")).click();
		System.out.println("Clicked on forgot account link");
		driver.navigate().back();
		System.out.println("Navigated back to facebook home page");
		driver.navigate().forward();
		System.out.println("Navigated forward to forgot account page");
		System.out.println("close driver");
		driver.close();}
}
