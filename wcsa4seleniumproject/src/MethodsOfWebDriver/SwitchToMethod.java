package MethodsOfWebDriver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchToMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.geckodriver.com", "./drivers.geckodriver.exe");
	    WebDriver driver = new FirefoxDriver();
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    driver.navigate().to("https://www.google.com/");
	    Thread.sleep(2000);
	    driver.switchTo().activeElement().sendKeys("Python", Keys.ENTER);
	    Thread.sleep(2000);
	    driver.navigate().forward();
	    Thread.sleep(2000);
	    driver.navigate().back();
	    Thread.sleep(2000);
	    driver.navigate().refresh();
	    

	}

}
