package com.sophosolutions.www.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features="src/test/resources/features",
        glue="com.sophosolutions.www.stepdefinitions",
        snippets= SnippetType.CAMELCASE,
        monochrome = true,
        dryRun = false)

public class ShoppingCart {
}
