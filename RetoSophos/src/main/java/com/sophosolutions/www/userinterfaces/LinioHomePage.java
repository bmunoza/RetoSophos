package com.sophosolutions.www.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.linio.com.pe/.")
public class LinioHomePage extends PageObject {

    public static final Target SEARCH_FIELD = Target.the("search text field in linio home page")
            .located(By.xpath("//div[@class='input-group']//input[@placeholder='Busca productos']"));

    public static final Target SEARCH_BUTTON = Target.the("search button in linio home page")
            .located(By.xpath("//button[@class='btn btn-primary btn-search']"));


    public static final Target ADD_TO_CART_BUTTON = Target.the("product link notebook lenovo in linio ")
            .located(By.xpath("//div[@class='product-bg-container product-general-info variation-info']//button[1]"));

    public static final Target GO_TO_CART_BUTTON = Target.the("product link notebook lenovo in linio ")
            .located(By.xpath("//a[@class='btn btn-sm btn-go-to-cart added-product']"));



}
