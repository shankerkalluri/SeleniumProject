import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.sun.org.apache.bcel.internal.generic.Select;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class ExForSelectFromDropdwn {
		
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\e003801\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS );
		driver.get("http://toolsqa.wpengine.com/automation-practice-form");
		Select s = new Select(driver.findElement(By.id("continents")));
		s.selectByVisibleText("Europe");
		System.out.println("Selected the item by Visibletext");
		Thread.sleep(2000);
		s.selectByIndex(2);
		System.out.println("Selected the item by its index");
		List<WebElement> items = s.getOptions();
		int iListSize = items.size();
		for(int i =0; i < iListSize ; i++){
		String sValue = s.getOptions().get(i).getText();
		System.out.println(sValue);
		}driver.quit();
		
	}

}
