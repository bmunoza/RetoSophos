package com.sophosolutions.www.stepdefinitions;

import com.sophosolutions.www.task.AddProductToShoppingCart;
import com.sophosolutions.www.task.OpenTheBrowser;
import com.sophosolutions.www.userinterfaces.LinioHomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

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
        theActorInTheSpotlight().attemptsTo(AddProductToShoppingCart.withTheName("Notebook Lenovo IdeaPad L340 Gaming, 15.6, Intel Core i5-9300H 2.4GHz, 8GB DDR4, 1TB SATA"));
    }

    @Then("^he should see that the product was added successfully$")
    public void heShouldSeeThatTheProductWasAddedSuccessfully() {
    }
}
