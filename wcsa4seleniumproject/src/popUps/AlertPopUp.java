package popUps;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.Chromediver.com", "./drivers.chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		  
		  driver.get("file:///C:/Users/HP/Desktop/Alert.html");
		  WebElement button = driver.findElement(By.xpath("//button[.='Click me!']"));
		  button.click();
		  
		  //now switch your control to Alert PopUp
		  
		  Alert a1 = driver.switchTo().alert();
		  
		  // accept the alert popup
		  
		  Thread.sleep(2000);
		 //// a1.accept();
		  
		  //dismiss alert popup
		  
		 //// a1.dismiss();
		  
		  //text of alert popup
		  
		   String textOfAlert = a1.getText();
		   System.out.println(textOfAlert);
		  
		 //// a1.sendKeys("Admin");
	}

}
