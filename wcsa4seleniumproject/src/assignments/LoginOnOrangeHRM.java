package assignments;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LoginOnOrangeHRM {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.Chromediver.com", "./drivers.chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
          driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
          WebElement target = driver.findElement(By.xpath("//h5[@class='oxd-text oxd-text--h5 orangehrm-login-title']"));
		  
          Actions act = new Actions(driver);
          act.moveToElement(target);
          
         WebElement clickAndHold = driver.findElement(By.xpath("//p[contains(.,'Admin')]"));
		  act.clickAndHold(clickAndHold).perform();
          Robot robot = new Robot();
   	    
          robot.keyPress(KeyEvent.VK_CONTROL);
		  robot.keyPress(KeyEvent.VK_C);
		  
		  robot.keyRelease(KeyEvent.VK_CONTROL);
		  robot.keyRelease(KeyEvent.VK_C);
		 
		  Thread.sleep(2000);
		  WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
	
		  robot.keyPress(KeyEvent.VK_CONTROL);
		  robot.keyPress(KeyEvent.VK_V);
		  
		  robot.keyRelease(KeyEvent.VK_CONTROL);
		  robot.keyRelease(KeyEvent.VK_V);
		

	}

}
