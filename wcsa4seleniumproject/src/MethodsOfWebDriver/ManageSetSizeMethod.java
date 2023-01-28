package MethodsOfWebDriver;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ManageSetSizeMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.geckodriver.com", "./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
	    Thread.sleep(2000); 
		Dimension targetSize = new Dimension(230,560);
		driver.manage().window().setSize(targetSize);

	}

}
