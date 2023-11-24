package Prueba1;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Hard_Assertion {
  @Test
  public void f() {
	  System.out.println("Hola selenium");
		String exePath = "./driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",exePath);
		WebDriver driver= new ChromeDriver();
		/*driver.get("https://www.google.com");*/
		driver.get("https://www.saucedemo.com");
		
		String actualTitle = driver.getTitle();
		String expectTitle = "Swag Labs";
	  
		Assert.assertEquals(actualTitle, expectTitle);
  }
  
  
  
  @AfterTest
  public void afterTest() {
  }

}
