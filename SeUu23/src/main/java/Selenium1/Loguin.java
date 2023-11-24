package Selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Loguin {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.out.println("Hola Selenium");
		String exePath= "./driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		WebElement Soy_el_userNameTxt = driver.findElement(By.id("user-name"));
		WebElement Soy_el_pwdTxt =driver.findElement(By.name("password"));
		WebElement Soy_el_loginBtn =driver.findElement(By.id("login-button"));
		
		
		Soy_el_userNameTxt.sendKeys("standard_user");
		Thread.sleep(2000);
		Soy_el_pwdTxt.sendKeys("secret_sauce");
		Thread.sleep(2000);
		Soy_el_loginBtn.click();
		Thread.sleep(2000);
		
		String url = driver.getTitle();
		System.out.println("El titulo de la pagina es: " + url);

	//	driver.navigate().back();
	//	Thread.sleep(2000);
	//	driver.navigate().forward();
	//	Thread.sleep(2000);
	//	driver.navigate().refresh();
	//	Thread.sleep(2000);
		
		boolean Soy_el_invetoryItemIsDisplayed = driver.findElement(By.className("inventory_item_name")).isDisplayed();
		
		if (Soy_el_invetoryItemIsDisplayed) {
			System.out.println("El articulo esta desplegado");
		}
		
		String Soy_el_itemName = driver.findElement(By.className("inventory_item_name")).getText();
		
		if (Soy_el_itemName.contains("Sauce Labs")){
			System.out.println("El producto es correcto");
		}else {
			System.out.println("ERROR: El producto es incorrecto");
			}
		
		Select oSelect =new Select(driver.findElement(By.xpath("//select[@data-test = 'product_sort_container']")));
		
		oSelect.selectByVisibleText("Price (high to low)"); 
		
		//Find elements
		
		List<WebElement> prodLists = driver.findElements(By.className("inventory_item_name"));
		System.out.println("Numero de elementos en la lista: " + prodLists.size());
		
		for (int i=0; i< prodLists.size();i++) {
			System.out.println("Los productos son: " + prodLists.get(i).getText());
			if(!prodLists.get(i).getText().contains("Labs")) {
				System.out.println("ERROR: El producto no es un producto LABS valido");
				break;
			}
		}
		//driver.close(); //Cierra la ventana pestaña actual que el webdriver esta usando
		driver.quit(); //Cierra toda la ventana que selenium abrio 
	}
	
}
