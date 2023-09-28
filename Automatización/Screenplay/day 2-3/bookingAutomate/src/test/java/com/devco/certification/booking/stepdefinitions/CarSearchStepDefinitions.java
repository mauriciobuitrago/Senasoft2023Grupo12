package com.devco.certification.booking.stepdefinitions;

/**
 * @author sebas-garcia-123@hotmail.com
 *
 * Clase que contiene los pasos a realizar por el actor para buscar carros en Booking.com.
 *
 */

import com.devco.certification.booking.models.CarsModel;
import com.devco.certification.booking.questions.BotAlertMessage;
import com.devco.certification.booking.tasks.GetIntoCars;
import com.devco.certification.booking.tasks.OpenTheBrowser;
import com.devco.certification.booking.tasks.SearchCarsBasedOn;
import com.devco.certification.booking.userinterfaces.BookingHomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.thucydides.core.annotations.ClearCookiesPolicy.BeforeEachTest;

public class CarSearchStepDefinitions {

    @Managed(driver = "chrome",
            clearCookies=BeforeEachTest)
    private WebDriver hisBrowser;
    private Actor user = Actor.named("user");
    private BookingHomePage bookingHomePage;

    @Before
    public void setUp() {
        user.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^that user wants to rent a car$")
    public void thatUserWantsToRentACar() {
        user.attemptsTo(OpenTheBrowser.on(bookingHomePage));
    }

    @When("^user gets on the cars page$")
    public void userGetsOnTheCarsPage()  {
       user.attemptsTo(GetIntoCars.page());
    }

    @When("^user enters the data for the service$")
    public void userEntersTheDataForTheService(List<CarsModel> location) {
       user.attemptsTo(SearchCarsBasedOn.user(location.get(0)));
    }

    @Then("^user should see the bot alert message$")
    public void userShouldSeeTheBotAlertMessage(){
        user.should(seeThat(BotAlertMessage.isDisplayed()));
    }

}
