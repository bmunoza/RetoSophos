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

    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
        theActorCalled("Brayan").whoCan(CallAnApi.at(BASE_URL.toString()));
    }

    @When("^Pepito consults a user's name$")
    public void pepitoConsultsAUserSName() {
        theActorInTheSpotlight().attemptsTo(ConsultTheUser.withTheData(CONSULT_USER.toString()));
    }

    @Then("^he should see that the full name is (.*) (.*)$")
    public void heShouldSeeThatTheFullNameIsMafaldaPacocha(String firstName,String lastName) {

        theActorInTheSpotlight().should(seeThatResponse(response -> response.statusCode(200)));

        theActorInTheSpotlight().should(seeThatResponse(
                response -> response
                        .body("result.first_name", equalTo(firstName))));

        theActorInTheSpotlight().should(seeThatResponse(
                response -> response
                        .body("result.last_name",equalTo(lastName))));
    }

}