package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class CountOfEmailsInPrimary {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chromedriver.com", "./drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://www.gmail.com");
         driver.findElement(By.id("identifierId")).sendKeys("rakeshpalekar07@gmail.com");
         Thread.sleep(1000);
         driver.findElement(By.xpath("//span[@class='VfPpkd-vQzf8d' and (contains(.,'Next'))]")).click();
         driver.findElement(By.xpath("//a[@class='WpHeLc VfPpkd-mRLv6 VfPpkd-RLmnJb' and (contains(.,'Try again'))]")).click();
         
	}

}
