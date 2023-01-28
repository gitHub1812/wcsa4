package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver.com","./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("https://demo.guru99.com/test/drag_drop.html");
		 
		
		 WebElement src = driver.findElement(By.xpath("//a[.='5000']"));
		 
		 WebElement target = driver.findElement(By.id("amt7"));
		 
		 Actions act = new Actions(driver);
		 act.dragAndDrop(src, target).perform();
	}

}
 

