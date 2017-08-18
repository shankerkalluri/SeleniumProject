package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
	
	public static void main(String args[]){
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\E003801\\Downloads\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-perform-mouse-hover-in-selenium.html");
		
		WebElement elc = driver.findElement(By.xpath("//button[text()='Automation Tools']"));
				
		Actions act = new Actions(driver);
		
		act.moveToElement(elc).perform();
		
		List<WebElement> links = driver.findElements(By.xpath("//div[@class='dropdown-content']//a"));
		
		int total_count=links.size();
		for(int i=0; i<total_count; i++){
			
			WebElement element = links.get(i);
			String text=element.getAttribute("innerHTML");
			System.out.println("Links name is"+text);
			
			if(text.equalsIgnoreCase("Appium")){
				
				element.click();
				break;
				
			}
		}
		
		driver.quit();
	}

}
