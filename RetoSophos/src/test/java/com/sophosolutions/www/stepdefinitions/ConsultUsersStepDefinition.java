package com.sophosolutions.www.stepdefinitions;


import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;
import static org.hamcrest.Matchers.hasItems;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import net.serenitybdd.screenplay.rest.interactions.Get;

public class ConsultUsersStepDefinition {
    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
        theActorCalled("Brayan").whoCan(CallAnApi.at("https://reqres.in"));
    }

    @When("^consulting the second group of three users\\.$")
    public void consultingTheSecondGroupOfThreeUsers() {
        theActorInTheSpotlight().attemptsTo(Get.resource("/api/users?page=2"));

    }

    @Then("^I should see the users$")
    public void iShouldSeeTheUsers() {

        theActorInTheSpotlight().should(seeThatResponse(
                response -> response.statusCode(200)
                        .body("data.last_name", hasItems("Holt", "Morris", "Ramos"))));

        theActorInTheSpotlight().should(seeThatResponse(
                response -> response.statusCode(200).body("data.first_name", hasItems("Eve", "Charles", "Tracey"))));

        theActorInTheSpotlight().should(seeThatResponse(response -> response.statusCode(204)));
    }

}