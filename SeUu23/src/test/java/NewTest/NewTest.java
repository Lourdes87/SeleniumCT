package NewTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class NewTest {
  @Test
  public void f() {
	  
	  SoftAssert softassert = new SoftAssert();
	  
	  System.out.println("Hola selenium");
		String exePath = "./driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",exePath);
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com");
		
		String actualTitle = driver.getTitle();
		String expectTitle = "Swag Labs";
		String badTitle = "swaglabs";
		
		softassert.assertEquals(actualTitle, expectTitle);
		softassert.assertEquals(actualTitle, badTitle);
		
		softassert.assertAll();
  }
}
