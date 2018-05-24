package testcase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import task.CadastroTask;

public class CadastroTestCase {

	private WebDriver driver;
	private CadastroTask cadastro;

	@Before
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		this.driver = new ChromeDriver();
		this.driver.get("http://www2.zaffari.com.br/");
		this.driver.manage().window().maximize();
		this.cadastro = new CadastroTask(driver);
	}

	@Test
	public void testMain() {
		this.cadastro.gerarCadastro();
		this.cadastro.preencherCadastro("Raul123", "acountsqn2@gmail.com", "23052018", "99999999999", "beija flor 412",
				"portugal", "porto alegre", "99999999", "51 99999999", "51 999999999");
		this.cadastro.enviarCadastro();
	}
	
	@After
	public void tearDown() {
		this.driver.quit();
	}

}
