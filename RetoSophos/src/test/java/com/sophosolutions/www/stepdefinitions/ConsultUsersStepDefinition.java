package com.sophosolutions.www.stepdefinitions;


import static com.sophosolutions.www.models.RestService.BASE_URL;
import static com.sophosolutions.www.models.RestService.CONSULT_USER;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;
import static org.hamcrest.Matchers.equalTo;
import com.sophosolutions.www.task.ConsultTheUser;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abiities.CallAnApi;

public class ConsultUsersStepDefinition {

    /* Se le otorgan las habilidades necesarias al Actor para navegar por la web
      e interactuar con un servicio REST
    */
    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
        theActorCalled("Brayan").whoCan(CallAnApi.at(BASE_URL.toString()));
    }


    //Se realiza solicitud GET para obtener un recurso REST
    @When("^Pepito consults a user's name$")
    public void pepitoConsultsAUserSName() {
        theActorInTheSpotlight().attemptsTo(ConsultTheUser.withTheData(CONSULT_USER.toString()));
    }

    @Then("^he should see that the full name is (.*) (.*)$")
    public void heShouldSeeThatTheFullNameIsMafaldaPacocha(String firstName,String lastName) {

        //¿La llamada devolvió un código de estado de 200(solicitud exitosa)?
        theActorInTheSpotlight().should(seeThatResponse(response -> response.statusCode(200)));

        //¿El nombre del usuario consultado es 'Mafalda'?
        theActorInTheSpotlight().should(seeThatResponse(
                response -> response
                        .body("result.first_name", equalTo(firstName))));

        //¿El apellido del usuario consultado es 'Pacocha'?
        theActorInTheSpotlight().should(seeThatResponse(
                response -> response
                        .body("result.last_name",equalTo(lastName))));
    }

}