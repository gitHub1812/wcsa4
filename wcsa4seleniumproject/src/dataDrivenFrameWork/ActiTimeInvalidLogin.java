package dataDrivenFrameWork;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeInvalidLogin {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("http://127.0.0.1/login.do;jsessionid=17kieilna0te8");
		
		Flib flib = new Flib();
		int rc = flib.rowCount("./data/ActiTimeTestData.xlsx", "invalidcreds");
		for(int i=1; i<=rc; i++)
		{
			String username = flib.readExcelData("./data/ActiTimeTestData.xlsx", "invalidcreds", i, 0);
			String password = flib.readExcelData("./data/ActiTimeTestData.xlsx", "invalidcreds", i, 1);
			
			WebElement usn = driver.findElement(By.name("username"));
			usn.sendKeys(username);
			WebElement pass = driver.findElement(By.name("pwd"));
			pass.sendKeys(password);
			driver.findElement(By.id("loginButton")).click();
			
			
		}
		
	}

}
