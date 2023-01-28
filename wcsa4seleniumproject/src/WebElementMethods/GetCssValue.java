package WebElementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValue {

	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver.com", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
       
		WebElement loginButton = driver.findElement(By.xpath("//button[contains(@class,'oxd-button oxd-button-')]"));
		String cssProperty = loginButton.getCssValue("color");
		System.out.println(cssProperty);
		

	}

}
