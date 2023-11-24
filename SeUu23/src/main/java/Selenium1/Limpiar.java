package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Limpiar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String exePath= "./driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver= new ChromeDriver();
		driver.get("https://appstestbc.com:8180/apps/#!/usuarios");
		driver.manage().window().maximize();
		
		WebElement DesOTP = driver.findElement(By.id("desbloqueoOtp"));
		DesOTP.click();
		WebElement DesOTPTxt = driver.findElement(By.id("no_celular"));
		DesOTPTxt.sendKeys("5539651989");
		WebElement BotAct = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/form/div[2]/div[6]/button"));
		Thread.sleep(1000);
		BotAct.click();
			
		WebElement DesPhon = driver.findElement(By.id("removePhone")) ;
		DesPhon.click();
		WebElement DesPhonTxt = driver.findElement(By.id("no_celular"));
		DesPhonTxt.sendKeys("5539651989");
		WebElement BotAct2 = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/form/div[2]/div[6]/button"));
		Thread.sleep(1000);
		BotAct2.click();
		
		WebElement DesExUs = driver.findElement(By.id("desbloqueoReg"));
		DesExUs.click();
		WebElement DesExUstxt = driver.findElement(By.id("no_cliente"));
		DesExUstxt.sendKeys("23432434");
		WebElement BotAct3 = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/form/div[2]/div[6]/button"));
		Thread.sleep(1000);
		BotAct3.click(); 
		
		WebElement DelTod = driver.findElement(By.id("removeAllDataCustomer"));
		DelTod.click();
		WebElement DelTodTxt = driver.findElement(By.id("no_cliente"));
		DelTodTxt.sendKeys("23432434"); 
		WebElement BotAct4 = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/form/div[2]/div[6]/button"));
		Thread.sleep(1000);
		BotAct4.click(); 
		 
	}

}
