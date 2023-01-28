package popUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionPopUp {
	public static void main(String[] args) {
		System.setProperty("webdriver.Chromediver.com", "./drivers.chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		  
		  driver.get("https://www.flipkart.com/");
		  WebElement button = driver.findElement(By.xpath("//button[.='✕']"));
		  button.click();
	}

}
