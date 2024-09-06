package starter.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;
import static starter.utils.Constantes.ACTOR;


import net.serenitybdd.screenplay.actors.OnStage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import starter.question.Result;
import starter.tasks.OpenCalculator;
import starter.tasks.Operation;


public class LogInStepDefinitions {

    @Given("el ingreso a la calculadora")
    public void elIngresoALaCalculadora(){
        OnStage.theActorCalled(ACTOR).attemptsTo(OpenCalculator.inDevice());
    }

    @When("los numeros {string} y {string} quieren hacer la operacion {string}")
    public void losNumerosYQuierenHacerLaOperacion(String numero1, String numero2, String operacion) {
        OnStage.theActorInTheSpotlight().attemptsTo(Operation.with(numero1, numero2, operacion));
    }

    @Then("el resultado debe ser {string}")
    public void elResultadoDebeSer(String resultadoEsperado) {
        OnStage.theActorInTheSpotlight().should(seeThat("Resultado igual a "+resultadoEsperado, Result.is(), equalTo(resultadoEsperado)));
    }
}