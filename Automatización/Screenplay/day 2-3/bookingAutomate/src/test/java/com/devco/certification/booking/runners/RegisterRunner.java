package com.devco.certification.booking.runners;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/register.feature",
        glue = "com.devco.certification.booking.stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class RegisterRunner {
}
