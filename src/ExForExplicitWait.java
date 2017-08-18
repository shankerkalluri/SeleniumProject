import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ExForExplicitWait {
	
	public static void main(String[] args) {
		String baseUrl = "http://demo.guru99.com/selenium/guru99home/";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\e003801\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize() ;
		WebDriverWait wait=new WebDriverWait(driver, 20);
		    String eTitle = "Demo Guru99 Page";
		    String aTitle = "" ;
		    driver.get(baseUrl);
		    aTitle = driver.getTitle();
		    if (aTitle.contentEquals(eTitle))
		    { System.out.println( "Test Passed") ;
		    } else {
		    System.out.println( "Test Failed" );
		    } WebElement seleniumlink;
		    seleniumlink= wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("SELENIUM")));
		    seleniumlink.click();
		    System.out.println( "Clicked on Selenium Link") ;
		    driver.close();
		    
	}
}
