package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_estrategia_01Page {

    private WebDriver driver;
    
    By definirButton = By.id("defineStrategyBtn");
    By implementarButton = By.id("implementStrategyBtn");
    By successMessage = By.id("successMessage");

    public tc_estrategia_01Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navegarAPaginaDeEstrategia() {
        driver.get("URL_DE_LA_PAGINA_DE_ESTRATEGIA");
    }

    public void definirEstrategia() {
        WebElement defineBtn = driver.findElement(definirButton);
        defineBtn.click();
    }

    public boolean estrategiaDefinidaExitosamente() {
        return driver.findElement(successMessage).isDisplayed();
    }

    public void implementarEstrategia() {
        WebElement implementBtn = driver.findElement(implementarButton);
        implementBtn.click();
    }

    public boolean estrategiaImplementadaCorrectamente() {
        return driver.findElement(successMessage).isDisplayed();
    }
}