package HomeWork;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SearchOnEbay {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chromedriver.com", "./drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com/");
        driver.findElement(By.id("gh-ac")).sendKeys("Watches");
       
	Select dropDown = new Select(driver.findElement(By.id("gh-cat")));
        dropDown.selectByVisibleText("All Categories");
        dropDown.selectByIndex(21);
        
        driver.findElement(By.id("gh-btn")).click();
        
        

	}

}
