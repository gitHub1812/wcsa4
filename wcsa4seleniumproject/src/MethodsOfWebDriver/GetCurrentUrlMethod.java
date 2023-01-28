package MethodsOfWebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrlMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:\\Users\\HP\\Desktop\\wcsa4workspace");
		String CurrentUrl = driver.getCurrentUrl();
		Thread.sleep(4000);
		System.out.println(CurrentUrl);
	}

}
