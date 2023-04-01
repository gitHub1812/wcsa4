package testngDynamicScreenshot;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.google.common.io.Files;


public class BaseTest {
	
	
	static WebDriver driver;
	public void initialization() {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://127.0.0.1/login.do;jsessionid=198xki3fbi2xq");
	}
	
	public void failedmethod(String methodName) {
		
		try
		{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("./screenShots/"+methodName+".png");
		Files.copy(src, dest);
		}
		
		catch(Exception e)
		{
			
		}
		
	}
	
	public void close() {
		
		driver.quit();
	}
	
	

}
