package com.devco.certification.booking.stepdefinitions;

/**
 * @author sebas-garcia-123@hotmail.com
 *
 * Clase que contiene los pasos a realizar por el actor para buscar atracciones turisticas en Booking.com.
 *
 */

import com.devco.certification.booking.models.AttractionsModel;
import com.devco.certification.booking.questions.ActivityName;
import com.devco.certification.booking.tasks.*;
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

public class AttractionSearchStepDefinitions {

    @Managed(driver = "chrome",
            clearCookies=BeforeEachTest)
    private WebDriver hisBrowser;
    private Actor user = Actor.named("user");
    private BookingHomePage bookingHomePage;

    @Before
    public void setUp() {
        user.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^that user wants to Search attractions or activities$")
    public void thatUserWantsToSearchAttractionsOrActivities() {
        user.attemptsTo(OpenTheBrowser.on(bookingHomePage));
    }

    @When("^user gets on the touristic attractions page$")
    public void userGetsOnTheTouristicAttractionsPage() {
        user.attemptsTo(GetIntoAttractions.Page());
    }

    @When("^searches for attractions on the desired place$")
    public void searchesForAttractionOnTheDesiredPlace(List<AttractionsModel> preferences){
        user.attemptsTo(SearchAttractionsWith.his(preferences.get(0)));
    }

    @When("^selects the desired category$")
    public void selectsTheDesiredCategory(List<AttractionsModel> fromOptions){
        user.attemptsTo(ChooseAttraction.category(fromOptions.get(0)));
    }

    @When("^selects the first option$")
    public void selectsTheFirstOption() {
        user.attemptsTo(SelectFirst.activityFromResults());
    }

    @When("^scroll down to activity details$")
    public void scrollDownToActivityDetails() {
        user.attemptsTo(ShowSelectedAttraction.description());
    }

    @Then("^user should see the name and description of the selected activity$")
    public void userShouldSeeTheNameAndDescriptionOfTheSelectedActivity() {
        user.should(seeThat(ActivityName.isDisplayed()));
    }

}
