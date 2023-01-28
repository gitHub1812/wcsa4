package MethodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetTitleMethod {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.geckodriver.com", "./drivers/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
     driver.manage().window().maximize();
     Thread.sleep(2000);
     driver.get("https://www.instagram.com/accounts/login/");
     String titleOfLoginPage = driver.getTitle();
     System.out.println(titleOfLoginPage);
     Thread.sleep(2000);
	}
	

}
