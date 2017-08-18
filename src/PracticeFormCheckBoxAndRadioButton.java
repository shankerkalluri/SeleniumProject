import java.util.List;
import java.util.concurrent.TimeUnit;
 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
 
public class PracticeFormCheckBoxAndRadioButton {
 
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\E003801\\Downloads\\geckodriver.exe");
		// Create FireFox browser object.
		WebDriver firefox = new FirefoxDriver();
 
		// Now maximize the browser window.
		firefox.manage().window().maximize();
 
		// Start the FireFox browser and open the page.
		// Provide the correct path of the HTML file.
		firefox.get("C:\\Selenium_Training\\SeleniumTraining\\CheckBoxAndRadioButton.html");
 
		// Set timeout value.
		firefox.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
		// Get the count of all available checkboxes.
		List<WebElement> list = firefox.findElements(By.tagName("input"));
 
		// Below code will select all of the check boxes and radio buttons.
		for (int i = 0; i < list.size(); i++) {
			// Checking the check box
			if (list.get(i).getAttribute("type").trim()
					.equalsIgnoreCase("checkbox")) {
 
				// Show the Checkbox count with value.
				System.out.println("CheckBox = " + i + " "
						+ list.get(i).getAttribute("value").trim());
 
				// Select the check box if not already selected.
				if (!(list.get(i).isSelected())) {
					list.get(i).click();
				} else {
					// De-select the check boxes.
					list.get(i).click();
				}
			} // Checking the Radio buttons.
			else if (list.get(i).getAttribute("type").trim()
					.equalsIgnoreCase("radio")) {
 
				// Show the size of radio buttons.
				System.out.println("Radio  = " + i + " "
						+ list.get(i).getAttribute("value").trim());
 
				// Select the radio button if not already selected.
				if (!(list.get(i).isSelected())) {
					list.get(i).click();
				}
			}
 
			// Pause so that you can see the results.
			Thread.sleep(5000);
		}
 
		// close the FireFox browser instance.
		firefox.close();
		
	}
}