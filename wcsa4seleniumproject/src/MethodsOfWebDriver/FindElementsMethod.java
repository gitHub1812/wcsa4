package MethodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsMethod {

	public static void main(String[] args) {
		System.setProperty("WebDriver.Chrome.com", "./drivers/chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
	   driver.manage().window().maximize();
       driver.get("https://www.instagram.com/");

	}

}
