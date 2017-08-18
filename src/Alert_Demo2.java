import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert_Demo2 {
	public static void main(String[] args) throws NoAlertPresentException {									
    	System.setProperty("webdriver.gecko.driver","C:\\Users\\E003801\\Downloads\\geckodriver.exe");
    	WebDriver driver = new FirefoxDriver();			
        		
        // Alert Message handling
                    		
        driver.get("http://demo.guru99.com/V4/");			
            driver.manage().window().maximize();                		
        driver.findElement(By.name("uid")).sendKeys("mngr79918");					
        driver.findElement(By.name("password")).sendKeys("nymEmav");					
        driver.findElement(By.name("btnLogin")).submit();		
        driver.findElement(By.linkText("Delete Customer")).click();			
        driver.findElement(By.name("cusid")).sendKeys("53920");			
        driver.findElement(By.name("AccSubmit")).submit();			
        // Switching to Alert        
        Alert alert=driver.switchTo().alert();		
        		
        // Capturing alert message.    
        String alertMessage=alert.getText();		
        		
        // Displaying alert message		
        System.out.println(alertMessage);			
        alert.dismiss();
        // Accepting alert		
        
        driver.quit();
            		
    }		
}
