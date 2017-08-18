import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
 
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
 
import org.openqa.selenium.WebElement;
 
import org.openqa.selenium.firefox.FirefoxDriver;
 
import org.openqa.selenium.interactions.Action;
 
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
 
public class DragAndDrop {
public static void main(String[] args) throws InterruptedException {
 

	System.setProperty("webdriver.gecko.driver","C:\\Users\\E003801\\Downloads\\geckodriver.exe");
	 WebDriver driver= new FirefoxDriver();
	
	driver.get("http://jqueryui.com/droppable/");
	driver.manage().window().maximize();
	//Wait for the frame to be available and switch to it
	WebDriverWait wait = new WebDriverWait(driver, 5);
	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.cssSelector(".demo-frame")));
	WebElement Sourcelocator = driver.findElement(By.cssSelector(".ui-draggable"));
	WebElement Destinationlocator = driver.findElement(By.cssSelector(".ui-droppable"));
	Thread.sleep(2000);
	dragAndDrop(driver,Sourcelocator,Destinationlocator);
	Thread.sleep(4000);
	String actualText=driver.findElement(By.cssSelector("#droppable>p")).getText();
	Assert.assertEquals(actualText, "Dropped!");

	

driver.quit();
 
}
public static void dragAndDrop(WebDriver driver,WebElement sourceElement, WebElement destinationElement) {
	try {
		if (sourceElement.isDisplayed() && destinationElement.isDisplayed()) {
			Actions action = new Actions(driver);
			action.dragAndDrop(sourceElement, destinationElement).build().perform();
		} else {
			System.out.println("Element was not displayed to drag");
		}
	} catch (StaleElementReferenceException e) {
		System.out.println("Element with " + sourceElement + "or" + destinationElement + "is not attached to the page document "
				+ e.getStackTrace());
	} catch (NoSuchElementException e) {
		System.out.println("Element " + sourceElement + "or" + destinationElement + " was not found in DOM "+ e.getStackTrace());
	} catch (Exception e) {
		System.out.println("Error occurred while performing drag and drop operation "+ e.getStackTrace());
	}
}
 
}