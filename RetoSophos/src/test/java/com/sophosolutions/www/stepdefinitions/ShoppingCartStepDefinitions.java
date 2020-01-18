package com.sophosolutions.www.stepdefinitions;

import com.sophosolutions.www.task.OpenTheBrowser;
import com.sophosolutions.www.userinterfaces.LinioHomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class ShoppingCartStepDefinitions {

    private LinioHomePage linioHomePage;

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that (.*) is on the linio website$")
    public void thatBrayanIsOnTheLinioWebsite(String actor){
        theActorCalled(actor).wasAbleTo(OpenTheBrowser.on(linioHomePage));
    }

    @When("^he add a product to the shopping cart$")
    public void heAddAProductToTheShoppingCart() {
    }

    @Then("^he should see that the product was added successfully$")
    public void heShouldSeeThatTheProductWasAddedSuccessfully() {
    }
}
