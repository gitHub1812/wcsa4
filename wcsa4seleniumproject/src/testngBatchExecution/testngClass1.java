package testngBatchExecution;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class testngClass1 extends BaseTest {
  @Test
  public void search1() {
	  
	  driver.switchTo().activeElement().sendKeys("Java",Keys.ENTER);
  }
}
