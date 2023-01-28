package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectionOfKadas {

	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver.com", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.bluestone.com/jewellery/watch+jewellery.html");
		
		WebElement target = driver.findElement(By.xpath("//a[.='All Jewellery ']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(target).perform();
		
		WebElement target1 = driver.findElement(By.xpath("//a[.='Kadas']"));
		act.moveToElement(target1).perform();
		driver.findElement(By.xpath("//a[.='Kadas']")).click();
		
		WebElement target3 = driver.findElement(By.xpath("//img[@class='hc img-responsive center-block']"));
		act.moveToElement(target3).perform();
		driver.findElement(By.xpath("//img[@class='hc img-responsive center-block']")).click();
		
		WebElement target2 = driver.findElement(By.id("buy-now"));
		act.moveToElement(target2).perform();
		
		driver.findElement(By.id("buy-now")).click();
		
	}

}
