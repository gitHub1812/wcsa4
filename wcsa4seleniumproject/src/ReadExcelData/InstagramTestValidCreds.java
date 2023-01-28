package ReadExcelData;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramTestValidCreds {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("weddriver.chromedriver.com", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.instagram.com/");
		
		Thread.sleep(2000);
		FileInputStream fis = new FileInputStream("./data/InstagramTestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("validcreds");
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(0);
		String username = cell.getStringCellValue();
		
		Thread.sleep(2000);
		FileInputStream fis2 = new FileInputStream("./data/InstagramTestData.xlsx");
		Workbook wb2 = WorkbookFactory.create(fis2);
		Sheet sheet2 = wb.getSheet("validcreds");
		Row row2 = sheet.getRow(1);
		Cell cell2 = row.getCell(2);
		String password = cell.getStringCellValue();
		
		
		
		 driver.findElement(By.name("username")).sendKeys(username);
         Thread.sleep(2000);
		 driver.findElement(By.name("password")).sendKeys(password);
		 driver.findElement(By.xpath("//button[.='Log in']")).click();
        
	}

}
