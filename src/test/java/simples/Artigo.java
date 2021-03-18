package simples;

import javafx.beans.property.SetProperty;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;


public class Artigo {
    String url;
    WebDriver driver;

    String buscaArtigo = "Ovo de Pascoa";

    @Before
    public void iniciar(){
        url = "https://pt.wikipedia.org";
        System.setProperty("webdriver.chrome.driver", "drivers/chrome/88_chromedriver.exe");
        driver = new ChromeDriver();  //Instanciar o Selenium WebDriver
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60000, TimeUnit.MILLISECONDS);
    }

    @After
    public void finalizar(){
        driver.quit();
    }

    @Test
    public void consultarArtigo(){
        //Abrir o site
        driver.get(url);
        //Realizar a busca
        driver.findElement(By.id("searchInput")).clear();
        driver.findElement(By.id("searchInput")).sendKeys(Keys.chord(buscaArtigo));
        driver.findElement(By.cssSelector("button.wvui-button")).click();
        //Validar o título da página de retorno
        assertEquals("Ovo de Páscoa", driver.findElement(By.id("firstHeading")).getText());
    }
}
