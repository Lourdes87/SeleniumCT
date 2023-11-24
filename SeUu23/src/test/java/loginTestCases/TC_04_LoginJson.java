package loginTestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonClasses.DriverSetup;
import commonClasses.GlobalVariables;
import commonClasses.WrapClass;
import navigationpages.SauceLoguinPage;

public class TC_04_LoginJson {

	WebDriver driver = DriverSetup.setupDriver();
	

	SauceLoguinPage loginPage = new SauceLoguinPage(driver);
	@BeforeTest
	public void startWebDriver() {
		driver.get(GlobalVariables.HOME_PAGE);
	}
	
	
  @Test
  public void TC_04() {
	  String user = WrapClass.getJsonValue("TC_04", "username");
	  String pwd = WrapClass.getJsonValue("TC_04", "password");
	System.out.println(user);  
	System.out.println(pwd);  
	  loginPage.loguinSauce(user, pwd);
  }
  
  @AfterTest
  public void closerDriver() {
	  WrapClass.takeScreenshot(driver, "TC_01");
	  driver.quit();
  }
  
}
