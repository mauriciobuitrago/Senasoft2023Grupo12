package com.devco.certification.booking.stepdefinitions;

/**
 * @author sebas-garcia-123@hotmail.com
 *
 * Clase que contiene los pasos a realizar por el actor para buscar taxis en Booking.com.
 *
 */

import com.devco.certification.booking.models.CabModel;
import com.devco.certification.booking.questions.SearchingCabsScreen;
import com.devco.certification.booking.tasks.GetIntoCabs;
import com.devco.certification.booking.tasks.OpenTheBrowser;
import com.devco.certification.booking.tasks.SearchCabsWith;
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

public class CabSearchStepDefinitions {

    @Managed(driver = "chrome",
            clearCookies=BeforeEachTest)
    private WebDriver hisBrowser;
    private Actor user = Actor.named("user");
    private BookingHomePage bookingHomePage;

    @Before
    public void setUp() {
        user.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^that user wants to reserve a cab$")
    public void thatUserWantsToReserveACab(){
        user.attemptsTo(OpenTheBrowser.on(bookingHomePage));
    }

    @When("^user gets on the cabs page$")
    public void userGetsOnTheCabsPage(){
        user.attemptsTo(GetIntoCabs.Page());
    }

    @When("^user enters the service preferences$")
    public void userEntersTheServicePreferences(List<CabModel> preferences){
        user.attemptsTo(SearchCabsWith.servicePreferences(preferences.get(0)));
    }

    @Then("^user should see the searching for cabs loading screen$")
    public void userShouldSeeTheSearchingForCabsLoadingScreen(){
        user.should(seeThat(SearchingCabsScreen.isDisplayed()));
    }

}
