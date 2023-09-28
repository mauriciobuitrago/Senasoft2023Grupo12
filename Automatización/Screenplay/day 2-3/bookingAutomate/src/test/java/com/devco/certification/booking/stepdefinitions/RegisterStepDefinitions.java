package com.devco.certification.booking.stepdefinitions;

/**
 * @author sebas-garcia-123@hotmail.com
 *
 * Clase que contiene los pasos a realizar por el actor para registrarse en Booking.com.
 *
 */

import com.devco.certification.booking.models.UserModel;
import com.devco.certification.booking.questions.RegisterCaptchaMessage;
import com.devco.certification.booking.tasks.CreateAnAccountWith;
import com.devco.certification.booking.tasks.GetIntoRegister;
import com.devco.certification.booking.tasks.OpenTheBrowser;
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

public class RegisterStepDefinitions {

    @Managed(driver = "chrome",
            clearCookies=BeforeEachTest)
    private WebDriver hisBrowser;

    private Actor user = Actor.named("user");

    private BookingHomePage bookingHomePage;

    @Before
    public void setUp() {
        user.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^that user wants to create an account on Booking.com$")
    public void thatUserWantsToCreateAnAccountOnBookingCom() {
        user.attemptsTo(OpenTheBrowser.on(bookingHomePage));
    }

    @When("^user clicks on Hazte una cuenta button$")
    public void userClicksOnHazteUnaCuentaButton() {
        user.attemptsTo(GetIntoRegister.Page());
    }

    @When("^user types his e-mail and creates a password$")
    public void userTypesHisEMailAndCreatesAPassword(List<UserModel> credentials) {
        user.attemptsTo(CreateAnAccountWith.credentials(credentials.get(0)));
    }

    @Then("^user should see the new user captcha message$")
    public void userShouldSeeTheNewUserCaptchaMessage() {
        user.should(seeThat(RegisterCaptchaMessage.isDisplayed()));
    }

}
