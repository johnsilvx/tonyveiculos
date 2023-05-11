package escolhaPorMarca;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class RolarPage {
    
    private WebDriver driver;

    public RolarPage(WebDriver driver) {
        this.driver = driver;
    }

    public void scroll() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        // se quiser rodar ate o footer o valor é 0,3000
        js.executeScript("window.scrollBy(0,800)"); // 0 = horizontal 800 = vertical (nesse caso rolar 800)
    }
}
