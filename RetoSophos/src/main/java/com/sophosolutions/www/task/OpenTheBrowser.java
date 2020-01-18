package com.sophosolutions.www.task;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

import static com.sophosolutions.www.userinterfaces.LinioHomePage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenTheBrowser implements Task {

    private PageObject page;

    public OpenTheBrowser(PageObject page){
        this.page = page;
    }
    @Override
    @Step("{0} opens the browser on linio home page")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(page),
                Click.on(SEARCH_FIELD),
                Enter.theValue("Notebook Lenovo IdeaPad L340 Gaming, 15.6, Intel Core i5-9300H 2.4GHz, 8GB DDR4, 1TB SATA").into(SEARCH_FIELD),
                Click.on(SEARCH_BUTTON),
                Click.on(PRODUCT_NOTEBOOK_LENOVO),
                Click.on(ADD_TO_CART_BUTTON),
                Click.on(GO_TO_CART_BUTTON));
    }

    public static OpenTheBrowser on( PageObject page){
        return instrumented(OpenTheBrowser.class,page);
    }
}
