package WebElementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chromedriver.com", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.get("file:///C:/Users/HP/Desktop/Dipa/UP.html");
		WebElement UseTextBox = driver.findElement(By.id("i1"));
		UseTextBox.sendKeys("Admin");
		Thread.sleep(2000);
		WebElement PassTextBox = driver.findElement(By.id("i2"));
		PassTextBox.sendKeys("Dipa@123");
		

	}

}
