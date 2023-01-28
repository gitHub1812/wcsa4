package popUps;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopUps {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.Chromediver.com", "./drivers.chromedriver.exe");
	   ChromeOptions co = new ChromeOptions();
   // maximize the browser without calling manage method
	   
	   //co.addArguments("-start-maximized");
	   
	  // co.addArguments("--disabled-notifications");
	   
	  WebDriver driver = new ChromeDriver(co);
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	  Thread.sleep(2000);
	  driver.get("https://www.olx.com/");
	}

}
