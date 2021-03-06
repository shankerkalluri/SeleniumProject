import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PracticeTables {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","C:\\Users\\E003801\\Downloads\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://toolsqa.wpengine.com/automation-practice-table");
	driver.manage().window().maximize();
	//Here we are storing the value from the cell in to the string variable
	String sCellValue = driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[1]/td[2]")).getText();
	System.out.println(sCellValue);
	
	// Here we are clicking on the link of first row and the last column
	driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[1]/td[6]/a")).click();
	Thread.sleep(2000);
	System.out.println("Link has been clicked otherwise an exception would have thrown");
	driver.close();
}
}