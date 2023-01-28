package WebElementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRectangleMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver.com", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.get("https://www.selenium.dev/downloads/");
		WebElement download = driver.findElement(By.xpath("//h1[.='Downloads']"));
		Rectangle Rect = download.getRect();
		
        int xaxis = Rect.getX();
        int yaxis = Rect.getY();
        int height = Rect.getHeight();
        int width = Rect.getWidth(); 
        System.out.println(xaxis+": is a x axis "+ yaxis +": is a y axix "+width + ":width " + height + "height");

	}

}
