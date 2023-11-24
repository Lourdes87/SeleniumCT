package loginTestCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonClasses.DriverSetup;
import commonClasses.GlobalVariables;
import navigationpages.InventoryPage;
import navigationpages.SauceLoguinPage;

public class TC_3 {

WebDriver driver = DriverSetup.setupDriver();
	
	SauceLoguinPage loginPage = new SauceLoguinPage(driver);
	InventoryPage inventoryPage = new InventoryPage(driver);
	
	@BeforeTest
	public void startWebDriver() {
		driver.get(GlobalVariables.HOME_PAGE);
	}
	
	
  @Test
  public void TC_03() {
	  loginPage.loguinSauce(GlobalVariables.USER_NAME,GlobalVariables.PASSWORD);
	  Assert.assertTrue(inventoryPage.addtoCartAndVerifyRmvBtn());
  }
  
  @AfterTest
  public void closerDriver() {
	  driver.quit();
  }
	
	
	
}
