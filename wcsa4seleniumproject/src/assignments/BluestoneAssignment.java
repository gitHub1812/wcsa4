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

public class BluestoneAssignment {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.Chromediver.com", "./drivers.chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		  driver.get("https://www.bluestone.com/jewellery/watch+jewellery.html");
		  
		WebElement target = driver.findElement(By.xpath("//a[@title='Watch Jewellery']"));
		  
		  Actions act = new Actions(driver);
		  act.moveToElement(target).perform();
		  
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//a[.='Band']")).click();
		  
		  WebElement clickAndHold = driver.findElement(By.xpath("//div[.='Filter by']"));
		  
		  for(int i=0; i<=2; i++)
		  {
			  act.clickAndHold(clickAndHold).perform();
		  }
		  
		  Robot robot = new Robot();
		  
		  robot.keyPress(KeyEvent.VK_CONTROL);
		  robot.keyPress(KeyEvent.VK_C);
		  
		  robot.keyRelease(KeyEvent.VK_CONTROL);
		  robot.keyRelease(KeyEvent.VK_C);
		 
		  Thread.sleep(2000);
		 WebElement searchBox = driver.findElement(By.id("search_query_top_elastic_search"));
		 searchBox.click();
		 
		 robot.keyPress(KeyEvent.VK_CONTROL);
		  robot.keyPress(KeyEvent.VK_V);
		  
		  robot.keyRelease(KeyEvent.VK_CONTROL);
		  robot.keyRelease(KeyEvent.VK_V);
		 driver.findElement(By.xpath("//input[@name='submit_search']")).click();
		  

	}

}
