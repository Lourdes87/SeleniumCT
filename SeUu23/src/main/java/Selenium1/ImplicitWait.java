package Selenium1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) throws InterruptedException {
		
				System.out.println("Hola Selenium");
				String exePath= "./driver/chromedriver.exe";
				System.setProperty("webdriver.chrome.driver", exePath);
				WebDriver driver= new ChromeDriver();
				driver.get("https://www.saucedemo.com/");
				
				Thread.sleep(2000);
				driver.manage().window().maximize();
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				WebElement Soy_el_userNameTxt = driver.findElement(By.id("user-name"));
				
				driver.quit();

	}

}
