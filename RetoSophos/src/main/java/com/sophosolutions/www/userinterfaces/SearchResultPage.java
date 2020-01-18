package com.sophosolutions.www.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchResultPage {

    public static final Target PRODUCT_NOTEBOOK_LENOVO = Target.the("product link notebook lenovo in linio ")
            .located(By.xpath("//span[@class='title-section']"));
}
