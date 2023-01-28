package WebElementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chromedriver.com", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("file:///C:/Users/HP/Desktop/Dipa/demo.html");
		
		WebElement checkBox = driver.findElement(By.xpath("//options[.='Idli']"));
       boolean status1 = checkBox.isSelected();
       System.out.println(status1);
       checkBox.click();
       Thread.sleep(2000);
       
       boolean status2 = checkBox.isSelected();
       System.out.println(status2);	
       
	}

}