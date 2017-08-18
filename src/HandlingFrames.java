import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingFrames {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\E003801\\Downloads\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://toolsqa.wpengine.com/iframe-practice-page/");
		driver.manage().window().maximize();
		//Switch by Index
		driver.switchTo().frame(0);
	/*	driver.switchTo().frame("IF1");
		driver.switchTo().frame(driver.findElement(By.id("IF1")));
	*/	driver.switchTo().defaultContent();
		driver.quit();
	}
}
