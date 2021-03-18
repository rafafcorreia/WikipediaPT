package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static org.junit.Assert.assertEquals;


public class Post extends Base {

    private final Base base;

    public Post(Base base) {
        this.base = base;
    }

    @Given("^que acesso a Wikipedia em Portugues$")
    public void queAcessoAWikipediaEmPortugues() {
        driver.get(base.url);
    }

    @When("^pesquiso por \"([^\"]*)\"$")
    public void pesquisoPor(String buscaArtigo) {
        driver.findElement(By.id("searchInput")).clear();                           //Presente no Código Fonte
        driver.findElement(By.id("searchInput")).sendKeys(Keys.chord(buscaArtigo)); //Presente no Código Fonte
        driver.findElement(By.cssSelector("button.wvui-button")).click();           //Presente no Inspecionar
        //driver.findElement(By.id("mw-searchButton")).click();                     Presente no código-fonte
        //driver.findElement(By.id("searchButton")).click();                        Presente no código-fonte
    }

    @Then("^exibe a expressao \"([^\"]*)\" no titulo da guia$")
    public void exibeAExpressaoNoTituloDaGuia(String artigo) {
        assertEquals(artigo, driver.findElement(By.id("firstHeading")).getText());
    }
}
