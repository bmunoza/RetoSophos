package com.sophosolutions.www.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ShoppingCartPage {

    public static final Target LENOVO_PRODUCT_NAME = Target.the("product link notebook lenovo in linio ")
            .located(By.xpath("//a[contains(text(),'Notebook Lenovo IdeaPad L340 Gaming, 15.6')]"));
}
