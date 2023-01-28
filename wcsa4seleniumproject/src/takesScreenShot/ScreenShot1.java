package takesScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;


import com.google.common.io.Files;

public class ScreenShot1 {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.Chromediver.com", "./drivers.chromedriver.exe");
		  ChromeDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		  driver.get("https://www.selenium.dev/");
		  
		  File src = driver.getScreenshotAs(OutputType.FILE);
		  File dest = new File("./screenShots/ScreenShot1.jpg");
          
		Files.copy(src, dest);
          
	}

}
