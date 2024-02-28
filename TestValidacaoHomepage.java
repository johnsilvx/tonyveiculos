package tony.veiculos;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// ÉPICO VALIDAÇÃO DA HOMEPAGE
public class ValidacaoHomepage {

	WebDriver driver; 

	@Before // ABRIR & MAXIMIZAR NAVEGADOR
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@After // FECHAR NAVEGADOR
	public void tearDown() throws Exception {
		driver.quit();
	}

	// STORY LINK HEADER
	// FUNCIONACILADADE Validar Links do Cabeçalho
	// COMO cliente
	// QUERO clicar nos botões do menu
	// PARA ter acesso as páginas

	@Test
	public void CT01ImgLogo() {
		driver.get("https://tonyveiculos.com.br/CompraProgramada/");
		// Clicar no link do logo da Tony Veículos no header
		driver.findElement(By.xpath("/html/body/div/div/div/div/nav/a/img")).click();
		// Verificar se a homepage é carregada corretamente
		assertEquals("https://tonyveiculos.com.br/", driver.getCurrentUrl());
	}

	@Test
	public void CT03BotaoEstoque() {
		driver.get("https://tonyveiculos.com.br/");
		// Clicar no link Estoque no header
		driver.findElement(By.xpath("//*[@id=\"mainMenu\"]/ul/li[2]/a")).click();
		// Verificar se a pág Estoque é carregada corretamente
		assertEquals("https://tonyveiculos.com.br/Estoque/", driver.getCurrentUrl());
	}

	@Test
	public void CT04BotaoVendaSeuCarro() {
		driver.get("https://tonyveiculos.com.br/");
		// Clicar no link Venda Seu Carro no header
		driver.findElement(By.xpath("//*[@id=\"mainMenu\"]/ul/li[3]/a")).click();
		// Verificar se a pág Venda Seu Carro é carregada corretamente
		assertEquals("https://tonyveiculos.com.br/Venda-seu-Carro/", driver.getCurrentUrl());
	}

	@Test
	public void CT05BotaoCompraProgramada() {
		driver.get("https://tonyveiculos.com.br/");
		// Clicar no link Compra Programada no header
		driver.findElement(By.xpath("//*[@id=\"mainMenu\"]/ul/li[4]/a")).click();
		// Verificar se a pág Compra Programada é carregada corretamente
		assertEquals("https://tonyveiculos.com.br/CompraProgramada/", driver.getCurrentUrl());
	}
	
	@Test
	public void CT06BotaoCalculeFinanciamento() {
		driver.get("https://tonyveiculos.com.br/");
		// Clicar no link Calcule seu Financiamento no header
		driver.findElement(By.xpath("//*[@id=\"mainMenu\"]/ul/li[5]/a")).click();
		// Verificar se a pág Calcule seu Financiamento é carregada corretamente
		assertEquals("https://calculadora.tonyveiculos.com.br/home", driver.getCurrentUrl());
	}
	
	@Test
	public void CT07BotaoContato() {
		driver.get("https://tonyveiculos.com.br/");
		// Clicar no link Contato no header
		driver.findElement(By.xpath("//*[@id=\"mainMenu\"]/ul/li[6]/a")).click();
		// Verificar se a pág Contato é carregada corretamente
		assertEquals("https://tonyveiculos.com.br/Contato/", driver.getCurrentUrl());
	}
	
	@Test
	public void CT08BotaoBlog() {
		driver.get("https://tonyveiculos.com.br/");
		// Clicar no link Blog no header
		driver.findElement(By.xpath("//*[@id=\"mainMenu\"]/ul/li[7]/a")).click();
		// Verificar se a pág Blog é carregada corretamente
		assertEquals("https://blog.tonyveiculos.com.br/", driver.getCurrentUrl());
	}
		

}
