package MethodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class QuitMethod {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.geckodriver.com", "./drivers/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	driver.quit();
	}

}
