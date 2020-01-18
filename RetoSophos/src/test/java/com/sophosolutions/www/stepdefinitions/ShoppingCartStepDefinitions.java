package com.sophosolutions.www.stepdefinitions;

import com.sophosolutions.www.questions.TheProductName;
import com.sophosolutions.www.task.AddProductToShoppingCart;
import com.sophosolutions.www.task.OpenTheBrowser;
import com.sophosolutions.www.userinterfaces.LinioHomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import static com.sophosolutions.www.models.ProductName.NINTENDO_SWITCH;
import static com.sophosolutions.www.userinterfaces.ShoppingCartPage.NINTENDO_SWITCH_PRODUCT_NAME;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

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
        theActorInTheSpotlight().attemptsTo(AddProductToShoppingCart.withTheName(NINTENDO_SWITCH.getName()));
    }

    @Then("^he should see that the product was added successfully$")
    public void heShouldSeeThatTheProductWasAddedSuccessfully() {
        theActorInTheSpotlight().should(seeThat(TheProductName.is(NINTENDO_SWITCH_PRODUCT_NAME),equalTo(NINTENDO_SWITCH.getName())));
    }
}
