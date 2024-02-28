package metodos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MetodosDeTestes {

	WebDriver driver;
	String urlEsperada;

	public void abrirNavegador(String url) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}

	public boolean validarURL(String urlEsperada) {
	    String urlAtual = driver.getCurrentUrl();
	    return urlAtual.equals(urlEsperada);
	}

	public void fecharNavegador() {
		driver.quit();
	}
	
	public WebDriver getDriver() {
	    return driver;
	}
}
