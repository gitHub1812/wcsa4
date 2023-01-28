package MethodsOfWebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class CloseMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/search?client=firefox-b-d&q=flipkart");
		Thread.sleep(4000);
		driver.close();
	}

}
