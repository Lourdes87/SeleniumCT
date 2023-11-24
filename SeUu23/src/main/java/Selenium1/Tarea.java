package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tarea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola Selenium");
		String exePath= "./driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		//loguin
		WebElement userName = driver.findElement(By.id("user-name"));
		WebElement pwd =driver.findElement(By.name("password"));
		WebElement loginBtn =driver.findElement(By.id("login-button"));
		
		userName.sendKeys("standard_user");
		pwd.sendKeys("secret_sauce");
		loginBtn.click();
		//Seleccionar producto
		WebElement Addcart=driver.findElement(By.id("add-to-cart-sauce-labs-backpack")); 
		WebElement cart=driver.findElement(By.id("shopping_cart_container"));
		
		Addcart.click();
		cart.click();
		//Confirmar compra en carrito
		WebElement Check=driver.findElement(By.id("checkout"));
		Check.click();
		
		//Datos del cliente
		WebElement FirstName=driver.findElement(By.id("first-name"));
		WebElement LastName=driver.findElement(By.id("last-name"));
		WebElement ZC=driver.findElement(By.id("postal-code"));
		WebElement Continuar=driver.findElement(By.id("continue"));
		
		FirstName.sendKeys("Lopez");
		LastName.sendKeys("Maria de Lourdes");
		ZC.sendKeys("10700");
		Continuar.click();
		//Finalizar compra
		WebElement Fin=driver.findElement(By.name("finish"));
		Fin.click();
		//un ejercicio de IF
		Boolean Gracias = driver.findElement(By.id("back-to-products")).isDisplayed();
		if (Gracias) {
		
			System.out.println("Se hizo la orden");
			}
		
		//compara el texto
		String Graciastxt = driver.findElement(By.className("complete-header")).getText();
		if (Graciastxt.contains("Thank you for your order!")){
			System.out.println("Texto correto");
		}else {
			System.out.println("ERROR: El texto es incorrecto y no se hizo la compra");
			}
	}

}
