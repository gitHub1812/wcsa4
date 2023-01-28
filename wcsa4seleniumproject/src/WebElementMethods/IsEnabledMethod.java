package WebElementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver.com", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.get("https://www.instagram.com/");
	    driver.findElement(By.name("username")).sendKeys("Dimpy1812");
	    driver.findElement(By.name("password")).sendKeys("Dont Know");
	   WebElement loginButton = driver.findElement(By.xpath("//button[.='Log in']"));
	    
	   boolean status = loginButton.isEnabled();
       System.out.println(status);
	    
	}

}
