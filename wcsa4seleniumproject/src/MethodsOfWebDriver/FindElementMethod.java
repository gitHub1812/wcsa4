package MethodsOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.com", "./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.instagram.com/");
        
      WebElement usernameTextBox = driver.findElement(By.name("username"));
      usernameTextBox.sendKeys("Dipali");
      System.out.println(usernameTextBox);
     
     	}

}
