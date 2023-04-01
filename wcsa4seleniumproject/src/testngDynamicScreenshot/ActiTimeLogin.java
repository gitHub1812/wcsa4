package testngDynamicScreenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Listeners(CustomListener.class)
public class ActiTimeLogin extends BaseTest {
	
	@BeforeMethod
	public void setUp() {
		
		initialization();
	}
	
	@Test
	public void loginMethod() {
		
		String loginPage = driver.getTitle();
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(loginPage, "loginID");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		sa.assertAll();
	}
	
	
	
	@Test(dependsOnMethods  = "loginMethod", alwaysRun = true)
	public void homePageMethod() throws InterruptedException {
		String loginPage = driver.getTitle();
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(loginPage, "loginID");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		
		Thread.sleep(2000);
		
		WebElement saveleaveTime = driver.findElement(By.id("SubmitTTButton"));
		
		if(saveleaveTime.isDisplayed())
		{
			Assert.assertEquals(true, true);
		}
		else
		{
			sa.assertEquals(true, false);
		}
		
	   WebElement logoutlink = driver.findElement(By.xpath("//a[text()='Logout']"));
	   
	   if(logoutlink.isDisplayed())
	   {
		   logoutlink.click();
	   }
	   
	   else
	   {
		  System.out.println("This is not logout link");
		   
	   }
	}
	
	@AfterMethod()
	public void tearDown() {
		driver.quit();
	}

}
