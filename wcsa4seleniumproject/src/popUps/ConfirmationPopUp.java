package popUps;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationPopUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.Chromediver.com", "./drivers.chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		  
		  driver.get("file:///C:/Users/HP/Desktop/Confirm.html");
		  WebElement button = driver.findElement(By.xpath("//button[.='Click me!']"));
		  button.click();
		  
		  //now switch your control to Confirmation PopUp
		
		  Alert al = driver.switchTo().alert();
		// to accept the pop up  
		
		  Thread.sleep(2000);
		  ///al.accept();

		  // to dismiss the popup
		  
		  al.dismiss();
	}

}
