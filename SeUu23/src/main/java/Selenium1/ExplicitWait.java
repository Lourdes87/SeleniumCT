package Selenium1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Hola Selenium");
		String exePath= "./driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		
		WebElement Soy_el_userNameTxt = new WebDriverWait (driver,Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.id("user-name")));
			
		
		driver.quit();

	}

}
