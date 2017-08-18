import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExForXpath {
	
	public static void main(String args[]){
		System.setProperty("webdriver.gecko.driver","C:\\Users\\E003801\\Downloads\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.gmail.com");
		driver.findElement(By.xpath("/html/body/div/div[2]/div[2]form/input[14]")).sendKeys("test@gmail.com");
		driver.findElement(By.xpath("/html/body/div/div[2]/div[2]form/input[15]")).sendKeys("1234");
		driver.findElement(By.xpath("/html/body/div/div[2]/div[2]form/input[16]")).click();
	}

}
