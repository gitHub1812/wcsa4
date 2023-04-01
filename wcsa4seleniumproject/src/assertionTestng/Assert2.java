package assertionTestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert2 {
  
	static WebDriver driver;
	@BeforeMethod
	public void launchBrowser()
	{
		//ChromeOptions co = new ChromeOptions();
		//co.addArguments("--remote-allow-origins=*");
		
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.do;jsessionid=198xki3fbi2xq");
	}
	
	@Test
  public void f() throws InterruptedException {
		String actualLoginPageTitle = driver.getTitle();
		SoftAssert sa = new SoftAssert();
		
		sa.assertEquals(actualLoginPageTitle, "actiTIME - Login");
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		
		String actualHomePageTitle = driver.getTitle();
		Assert.assertEquals(actualHomePageTitle, "actiTIME - Enter Time-Track");
		
		driver.findElement(By.className("logout")).click();
  }
  
  
  @BeforeTest
  public void property()
  {
	  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
  }
  
  @AfterMethod
  public void logOut() {
	  
	  driver.quit();
  }
}
