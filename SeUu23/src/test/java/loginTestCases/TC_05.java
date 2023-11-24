package loginTestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonClasses.DriverSetup;
import commonClasses.GlobalVariables;
import commonClasses.WrapClass;
import navigationpages.SauceLoguinPage;

public class TC_05 {

WebDriver driver = DriverSetup.setupDriver();
	
	SauceLoguinPage loginPage = new SauceLoguinPage(driver);
	
	@BeforeTest
	public void startWebDriver() {
		driver.get(GlobalVariables.HOME_PAGE);
	}
	
	
  @Test
  public void TC_05_ex() {
	  
	  String user = WrapClass.getCellData("TC_05",1,0 );
	  String pwd = WrapClass.getCellData("TC_05", 1,1);
	  
	  loginPage.loguinSauce(user,pwd);
  }
  
  @AfterTest
  public void closerDriver() {
	  WrapClass.takeScreenshot(driver, "TC_05");
	  driver.quit();
  }
	
}
