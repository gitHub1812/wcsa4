package MethodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.geckodriver.com", "./drivers/geckodriver.exe");
	     WebDriver driver = new FirefoxDriver();
	     driver.manage().window().maximize();
	    driver.navigate().to("https://www.amazon.com/");
	    driver.navigate().back();
	    Thread.sleep(2000);
	    driver.navigate().forward();
	    Thread.sleep(2000);
	    driver.navigate().refresh();
	}

}
