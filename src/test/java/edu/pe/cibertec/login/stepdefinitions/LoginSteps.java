package edu.pe.cibertec.login.stepdefinitions;

import edu.pe.cibertec.login.questions.LoginResult;
import edu.pe.cibertec.login.tasks.Login;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class LoginSteps {

    private String usuarioIngresado;
    private String passwordIngresado;

    @Given("{word} abre la app de login")
    public void Lucia_abre_la_app_de_login(String nombre) {
        OnStage.theActorCalled(nombre);
    }

    @When("ella ingresa el usuario {string} y la contrasena {string}")
    public void ella_ingresa_credenciales(String usuario, String contrasna) {
        this.usuarioIngresado = usuario;
        this.passwordIngresado = contrasna;
    }

    @And("ella presion el boton ingresar")
    public void el_presion_el_boton_ingresar() {
        OnStage.theActorInTheSpotlight()
                .attemptsTo(Login.conCredenciales(usuarioIngresado, passwordIngresado));
    }

    @Then("ella deberia ver la pantalla principal")
    public void el_deberia_ver_la_pantalla_principal() {
        OnStage.theActorInTheSpotlight()
                .should(seeThat(LoginResult.estaVisible(), equalTo(true)));
    }


}
