import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ExForBasicXpath {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\e003801\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String baseUrl="http://demo.guru99.com/v1/";
		driver.get(baseUrl);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Sai");
		System.out.println("Entered username");
		driver.close();
		}

}
