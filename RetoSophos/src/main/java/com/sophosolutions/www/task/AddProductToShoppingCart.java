package com.sophosolutions.www.task;

import com.sophosolutions.www.exceptions.AddProductException;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.ElementNotVisibleException;
import static com.sophosolutions.www.exceptions.AddProductException.ELEMENT_NO_VISIBLE_FAILED_MESSAGE;
import static com.sophosolutions.www.userinterfaces.LinioHomePage.SEARCH_BUTTON;
import static com.sophosolutions.www.userinterfaces.LinioHomePage.SEARCH_FIELD;
import static com.sophosolutions.www.userinterfaces.SearchResultPage.ADD_TO_CART_BUTTON;
import static com.sophosolutions.www.userinterfaces.SearchResultPage.GO_TO_CART_BUTTON;
import static com.sophosolutions.www.userinterfaces.SearchResultPage.PRODUCT_NOTEBOOK_LENOVO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AddProductToShoppingCart implements Task {

    private String nameProduct;

    public AddProductToShoppingCart(String nameProduct){
        this.nameProduct = nameProduct;
    }


    @Override
    @Step("{0} add a product to shopping cart on linio website")
    public <T extends Actor> void performAs(T actor) {
        try {
            actor.attemptsTo(Click.on(SEARCH_FIELD),
                    Enter.theValue(nameProduct).into(SEARCH_FIELD),
                    Click.on(SEARCH_BUTTON),
                    Click.on(PRODUCT_NOTEBOOK_LENOVO),
                    Click.on(ADD_TO_CART_BUTTON),
                    Click.on(GO_TO_CART_BUTTON));
        }catch (ElementNotVisibleException e){
            throw new AddProductException(ELEMENT_NO_VISIBLE_FAILED_MESSAGE,e);
        }
    }

    public static AddProductToShoppingCart withTheName(String nameProduct){
        return instrumented(AddProductToShoppingCart.class,nameProduct);
    }
}
