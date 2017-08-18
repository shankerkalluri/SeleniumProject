import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBxRadioBtn {
	 
		public static void main(String[] args) throws Exception {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\E003801\\Downloads\\geckodriver.exe"); 
			// Launch browser
			WebDriver driver = new FirefoxDriver();
	 
			// Maximize window
			driver.manage().window().maximize();
	 
			// Navigate to the URL
			driver.get("http://www.techbeamers.com");
	 
			// Sleep for 5 seconds
			Thread.sleep(5000);
	 
			// Store all the elements of the same category in the list of WebLements.
			List<WebElement> list = driver.findElements(By.name("radioButton"));
	 
			// Create a boolean variable to store true/false.
			Boolean is_selected = list.get(0).isSelected();
	 
			// If 'is_selected' is true that means the first radio button is
			// selected.
			if (is_selected == true) {
	 
				// If the first radio button is selected by default then,
				// select the second radio button.
				list.get(1).click();
	 
			} else {
	 
				// If the first radio button is not selected then, click the first
				// radio button.
				list.get(0).click();
			}
		}
	}