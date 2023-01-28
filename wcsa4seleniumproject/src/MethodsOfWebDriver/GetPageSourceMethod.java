package MethodsOfWebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;


public class GetPageSourceMethod {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.geckodriver.com", "./drivers/geckodriver.exe");
	 FirefoxDriver driver = new FirefoxDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.facebook.com/" );
	String SourceCode = driver.getPageSource();
	Thread.sleep(2000);
	System.out.println(SourceCode);

	}

}
