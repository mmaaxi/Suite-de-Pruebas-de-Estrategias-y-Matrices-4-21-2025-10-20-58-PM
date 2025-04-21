package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.tc_estrategia_01Page;
import static org.junit.Assert.assertTrue;

public class tc_estrategia_01Steps {

    tc_estrategia_01Page estrategiaPage = new tc_estrategia_01Page();

    @Given("El usuario está en la página de estrategia")
    public void el_usuario_esta_en_la_pagina_de_estrategia() {
        estrategiaPage.navegarAPaginaDeEstrategia();
    }

    @When("El usuario define la estrategia")
    public void el_usuario_define_la_estrategia() {
        estrategiaPage.definirEstrategia();
    }

    @Then("La estrategia se define exitosamente")
    public void la_estrategia_se_define_exitosamente() {
        assertTrue(estrategiaPage.estrategiaDefinidaExitosamente());
    }

    @When("El usuario implementa la estrategia")
    public void el_usuario_implementa_la_estrategia() {
        estrategiaPage.implementarEstrategia();
    }

    @Then("La estrategia se implementa correctamente")
    public void la_estrategia_se_implementa_correctamente() {
        assertTrue(estrategiaPage.estrategiaImplementadaCorrectamente());
    }
}