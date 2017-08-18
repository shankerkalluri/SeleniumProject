import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ExForAlerts {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\e003801\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/selenium/delete_customer.php");
		driver.findElement(By.name("cusid")).sendKeys("53920");
		driver.findElement(By.name("submit")).click();
		Alert alert = driver.switchTo().alert();      // Switching to Alert 
		String alertMessage= driver.switchTo().alert().getText();     // Capturing alert message.    
		System.out.println(alertMessage);       // Displaying alert message
		alert.accept();      // Accepting alert
		driver.close();
	}
}
