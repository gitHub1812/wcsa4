package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollLeft {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chromedriver.com", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://dashboards.handmadeinteractive.com/jasonlove/");
		
		// To perform Scrolling Operation
		JavascriptException jse = (JavascriptException) driver;
		
		//Scroll Left
		
		Thread.sleep(2000);
		
		
		

	}

}
