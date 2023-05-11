package escolhaPorMarca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.Set;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validacao {

	WebDriver driver;
	WebDriverWait wait;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tonyveiculos.com.br/");

		RolarPage rolarPage = new RolarPage(driver);
		rolarPage.scroll();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testBmw() throws InterruptedException {

		Thread.sleep(500);

		// clica na imagem bmw
		driver.findElement(By.xpath("//*[@id=\"carouselMarcas\"]/div/div[1]/div/div[1]/a/img")).click();

		// Obter as alças (handles) das janelas/abas
		Set<String> handles = driver.getWindowHandles();
		String primeiraAba = driver.getWindowHandle();
		handles.remove(primeiraAba);

		// Mudar para a nova aba
		String segundaAba = handles.iterator().next();
		driver.switchTo().window(segundaAba);

		// Validar se o link está funcionando corretamente
		String urlAtual = driver.getCurrentUrl();
		assertEquals(urlAtual, "https://tonyveiculos.com.br/Estoque/?marca=19");
	}

	@Test
	public void testFord() throws InterruptedException {

		Thread.sleep(500);

		// clica na seta direita UMA vez
		WebElement setaDir = driver.findElement(By.xpath("//*[@id=\"marcasCarrosel\"]/div/div[2]/div[3]/a"));
		setaDir.click();

		Thread.sleep(500);

		// clica na imagem ford
		driver.findElement(By.xpath("//*[@id=\"carouselMarcas\"]/div/div[2]/div/div[2]/a/img")).click();

		// Obter as alças (handles) das janelas/abas
		Set<String> handles = driver.getWindowHandles();
		String primeiraAba = driver.getWindowHandle();
		handles.remove(primeiraAba);

		// Mudar para a nova aba
		String segundaAba = handles.iterator().next();
		driver.switchTo().window(segundaAba);

		// Validar se o link está funcionando corretamente
		String urlAtual = driver.getCurrentUrl();
		assertEquals(urlAtual, "https://tonyveiculos.com.br/Estoque/?marca=68");
	}

	@Test
	public void testJac() throws InterruptedException {

		Thread.sleep(500);

		// clica na seta direita DUAS vezes
		WebElement setaDir = driver.findElement(By.xpath("//*[@id=\"marcasCarrosel\"]/div/div[2]/div[3]/a"));
		setaDir.click();
		Thread.sleep(1000);
		setaDir.click();

		Thread.sleep(500);
		// clica na imagem jac
		driver.findElement(By.xpath("//*[@id=\"carouselMarcas\"]/div/div[3]/div/div[2]/a/img")).click();

		// Obter as alças (handles) das janelas/abas
		Set<String> handles = driver.getWindowHandles();
		String primeiraAba = driver.getWindowHandle();
		handles.remove(primeiraAba);

		// Mudar para a nova aba
		String segundaAba = handles.iterator().next();
		driver.switchTo().window(segundaAba);

		// Validar se o link está funcionando corretamente
		String urlAtual = driver.getCurrentUrl();
		assertEquals(urlAtual, "https://tonyveiculos.com.br/Estoque/?marca=95");
	}

	@Test
	public void testKia() throws InterruptedException {

		Thread.sleep(500);

		// clica na seta esquerda UMA vez
		WebElement setaEsq = driver.findElement(By.xpath("//*[@id=\"marcasCarrosel\"]/div/div[2]/div[1]/a"));
		setaEsq.click();

		Thread.sleep(500);

		// clica na imagem kia
		driver.findElement(By.xpath("//*[@id=\"carouselMarcas\"]/div/div[6]/div/div[2]/a/img")).click();

		// Obter as alças (handles) das janelas/abas
		Set<String> handles = driver.getWindowHandles();
		String primeiraAba = driver.getWindowHandle();
		handles.remove(primeiraAba);

		// Mudar para a nova aba
		String segundaAba = handles.iterator().next();
		driver.switchTo().window(segundaAba);

		// Validar se o link está funcionando corretamente
		String urlAtual = driver.getCurrentUrl();
		assertEquals(urlAtual, "https://tonyveiculos.com.br/Estoque/?marca=108");
	}

	@Test
	public void testPorsche() throws InterruptedException {

		Thread.sleep(500);

		// clica na seta esquerda DUAS vezes
		WebElement setaEsq = driver.findElement(By.xpath("//*[@id=\"marcasCarrosel\"]/div/div[2]/div[1]/a"));
		setaEsq.click();
		Thread.sleep(1000);
		setaEsq.click();

		Thread.sleep(500);

		// clica na imagem porsche
		driver.findElement(By.xpath("//*[@id=\"carouselMarcas\"]/div/div[5]/div/div[3]/a/img")).click();

		// Obter as alças (handles) das janelas/abas
		Set<String> handles = driver.getWindowHandles();
		String primeiraAba = driver.getWindowHandle();
		handles.remove(primeiraAba);

		// Mudar para a nova aba
		String segundaAba = handles.iterator().next();
		driver.switchTo().window(segundaAba);

		// Validar se o link está funcionando corretamente
		String urlAtual = driver.getCurrentUrl();
		assertEquals(urlAtual, "https://tonyveiculos.com.br/Estoque/?marca=158");
	}
	
	@Test
	public void testVw() throws InterruptedException {

		Thread.sleep(500);

		// clica na seta direita TRES vezes
		WebElement setaDir = driver.findElement(By.xpath("//*[@id=\"marcasCarrosel\"]/div/div[2]/div[3]/a"));
		setaDir.click();
		Thread.sleep(1000);
		setaDir.click();
		Thread.sleep(1000);
		setaDir.click();

		Thread.sleep(500);
		// clica na imagem vw
		driver.findElement(By.xpath("//*[@id=\"carouselMarcas\"]/div/div[4]/div/div[4]/a/img")).click();

		// Obter as alças (handles) das janelas/abas
		Set<String> handles = driver.getWindowHandles();
		String primeiraAba = driver.getWindowHandle();
		handles.remove(primeiraAba);

		// Mudar para a nova aba
		String segundaAba = handles.iterator().next();
		driver.switchTo().window(segundaAba);

		// Validar se o link está funcionando corretamente
		String urlAtual = driver.getCurrentUrl();
		assertEquals(urlAtual, "https://tonyveiculos.com.br/Estoque/?marca=191");
	}
