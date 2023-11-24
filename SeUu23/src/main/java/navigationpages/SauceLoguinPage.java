package navigationpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonClasses.WrapClass;

public class SauceLoguinPage {
	
	public SauceLoguinPage (WebDriver driver){
		PageFactory.initElements(driver,this);
	
	}
	
	//LoguinPage WebElements
	@FindBy (id= "user-name")
	private WebElement userNameTxt;
	@FindBy (id= "password")
	private WebElement pwdTxt;
	@FindBy (id= "login-button")
	private WebElement loguinBTN;
	@FindBy (id= "//h3[@data-test = 'error']")
	private WebElement errorlockLb1;
	
	//Metodos de loginpage
	
	public void loguinSauce (String user,String pwd) {
		WrapClass.sendkeys(userNameTxt, user);
		WrapClass.sendkeys(pwdTxt, pwd);
		WrapClass.click(loguinBTN);
	}
	
	public boolean validateLockError() {
		boolean errorDisplayed = WrapClass.geText(errorlockLb1).contains("Sorry, this user has been loocked out.");
		return errorDisplayed;
	}
	
}
