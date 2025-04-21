package steps;

import org.junit.Assert;
import pages.tc_matriz_01Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class tc_matriz_01Steps {
    tc_matriz_01Page matrizPage = new tc_matriz_01Page();

    @Given("el sistema ha generado una matriz")
    public void generarMatriz() {
        matrizPage.generarMatriz();
    }

    @When("verifico el contenido de la matriz")
    public void verificarContenidoDeLaMatriz() {
        Assert.assertTrue("La matriz no fue generada correctamente", matrizPage.validarMatrizGenerada());
    }

    @Then("el contenido de la matriz es correcto")
    public void contenidoCorrecto() {
        Assert.assertTrue("El contenido de la matriz es incorrecto", matrizPage.validarContenidoDeMatriz());
    }
}