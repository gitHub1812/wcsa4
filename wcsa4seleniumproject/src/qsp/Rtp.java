package qsp;

import java.util.Scanner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Rtp {
	public static void main(String[] args) throws InterruptedException {
	Scanner sc = new Scanner (System.in);
	  System.out.println("Which Browser u want to launch");
	  String browservalue=sc.next();
	  if(browservalue.equalsIgnoreCase("Chrome")) {
		  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://www.instagram.com/accounts/login/");
	      Thread.sleep(4000);
	      driver.close();
	  }
	  else if(browservalue.equalsIgnoreCase("Firefox")) {
		  System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		  WebDriver driver = new FirefoxDriver();
	      driver.manage().window().maximize();
	      driver.get("https://www.instagram.com/accounts/login/");
	      Thread.sleep(4000);
	      driver.close();
	  }
	  else 
	    	  System.out.println ("Enter the valid Browser name");
	     
	  }

}
