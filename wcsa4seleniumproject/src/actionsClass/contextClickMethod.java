package actionsClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class contextClickMethod {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.Chromedriver.com", "./drivers/Chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		 
		 driver.get("file:///C:/Users/Qspiders%20Wakad/Desktop/wcsa4/MultiSelectDropDown.html ");
	}

}
