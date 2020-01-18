package com.sophosolutions.www.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchResultPage {

    public static final Target PRODUCT_NOTEBOOK_LENOVO = Target.the("product link notebook lenovo in linio ")
            .located(By.xpath("//span[@class='title-section']"));

    public static final Target ADD_TO_CART_BUTTON = Target.the("product link notebook lenovo in linio ")
            .located(By.xpath("//div[@class='product-bg-container product-general-info variation-info']//button[1]"));

    public static final Target GO_TO_CART_BUTTON = Target.the("product link notebook lenovo in linio ")
            .located(By.xpath("//a[@class='btn btn-sm btn-go-to-cart added-product']"));
}
