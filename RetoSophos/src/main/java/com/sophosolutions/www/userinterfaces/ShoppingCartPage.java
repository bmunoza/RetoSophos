package com.sophosolutions.www.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ShoppingCartPage {

    public static final Target LENOVO_PRODUCT_NAME = Target.the("product link notebook lenovo in linio ")
            .located(By.xpath("//a[contains(text(),'Nintendo Switch 2019 Neon Bateria Extendida + Supe')]"));
}
