package appobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartaoAppObject {
	
	private WebDriver driver; 
	
	public CartaoAppObject(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getSoliciteCarta() {
		return this.driver.findElement(By.xpath("//*[@id=\"conteudo-internas\"]/div[2]/div[6]/a"));
	}
	
	public WebElement getCPFTextField() {
		return this.driver.findElement(By.id("cpf"));
	}
	
	public WebElement getNOmeTextField() {
		return this.driver.findElement(By.id("nome"));
	}
	
	public WebElement getNomeTextField() {
		return this.driver.findElement(By.id("nome"));
	}
	
	public WebElement get() {
		return this.driver.findElement(by);
	}
	
	public WebElement get() {
		return this.driver.findElement(by);
	}
	
	public WebElement get() {
		return this.driver.findElement(by);
	}
	
	public WebElement get() {
		return this.driver.findElement(by);
	}
	
	public WebElement get() {
		return this.driver.findElement(by);
	}
	
	public WebElement get() {
		return this.driver.findElement(by);
	}
	
	public WebElement get() {
		return this.driver.findElement(by);
	}
	
	public WebElement get() {
		return this.driver.findElement(by);
	}
	
	public WebElement get() {
		return this.driver.findElement(by);
	}
	
	public WebElement get() {
		return this.driver.findElement(by);
	}
	
	public WebElement get() {
		return this.driver.findElement(by);
	}
}
