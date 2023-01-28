package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chromedriver.com", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://jqueryui.com/droppable/");
		
		Thread.sleep(1000);
	   	WebElement src = driver.findElement(By.xpath("//div[@class='ui-widget-content ui-draggable ui-draggable-handle' and (contains(.,'Drag me to my target'))]"));
	   	
	    WebElement target = driver.findElement(By.xpath("//div[@class='ui-widget-header ui-droppable' and (contains(.,'Drop here'))]"));
	    
	    Actions act = new Actions(driver);  
	    act.dragAndDrop(src, target).perform();
		

	}

}
