package loginTestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonClasses.DriverSetup;
import commonClasses.GlobalVariables;
import navigationpages.SauceLoguinPage;

public class TC_02_Login {
	
	WebDriver driver = DriverSetup.setupDriver();
	
	SauceLoguinPage loginPage = new SauceLoguinPage(driver);
	
	@BeforeTest
	public void startWebDriver() {
		driver.get(GlobalVariables.HOME_PAGE);
	}
	
	
  @Test
  public void TC_01() {
	  loginPage.loguinSauce(GlobalVariables.USER_NAME,GlobalVariables.PASSWORD);
  }
  
  @AfterTest
  public void closerDriver() {
	  driver.quit();
  }
  
}
