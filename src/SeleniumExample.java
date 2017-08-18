import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumExample {
public static void main(String args[])
{
System.out.println("Launching Chrome Browser");
System.setProperty("webdriver.chrome.driver", "C:\\Users\\E003801\\Downloads\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.navigate().to("http://www.google.com");
String expectedTitle="Google";
String actualTitle = driver.getTitle();
System.out.println("Page title: - "+actualTitle);
if (actualTitle.contentEquals(expectedTitle)){System.out.println("Test Passed!");
        } else { System.out.println("Test Failed");
        }
System.out.println("Closing chrome browser");
driver.close();
}
}