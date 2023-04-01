package testngBatchExecution;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ActiTimeValidLogin {
	
	static WebDriver driver;

  @Test
  @Parameters({"Browser", "Url", "Username", "Password"})
  public void validLogin(String Browser, String Url, String Username, String Password) {
	  
	 
	  if(Browser.equalsIgnoreCase("chrome"))
	  {
		  System.setProperty("webdriver.chrome.driver", "./drivers/chromerdriver.exe");
		  
		  ChromeOptions co = new ChromeOptions();
		  co.addArguments("--remote-allow-origins=*");
		  driver=new ChromeDriver(co);
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		  driver.get(Url);
		  
		  driver.findElement(By.name("username")).sendKeys(Username);
		  driver.findElement(By.name("pwd")).sendKeys(Password);
		  driver.findElement(By.id("loginButton")).click();
		  
	  }
	  
	  else if(Browser.equalsIgnoreCase("Firefox"))
	  {
		  System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		  driver = new FirefoxDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		  driver.get(Url);
		  
		  driver.findElement(By.name("username")).sendKeys(Username);
		  driver.findElement(By.name("pwd")).sendKeys(Password);
		  driver.findElement(By.id("loginButton")).click();
		  
	  }
	  
	  else if(Browser.equalsIgnoreCase("Edge"))
	  {
		  System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		  driver = new EdgeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		  driver.get(Url);
		  
		  driver.findElement(By.name("username")).sendKeys(Username);
		  driver.findElement(By.name("pwd")).sendKeys(Password);
		  driver.findElement(By.id("loginButton")).click();
	  }
  }
}
