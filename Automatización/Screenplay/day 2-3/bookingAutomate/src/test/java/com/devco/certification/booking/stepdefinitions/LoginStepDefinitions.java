package com.devco.certification.booking.stepdefinitions;

/**
 * @author sebas-garcia-123@hotmail.com
 *
 * Clase que contiene los pasos a realizar por el actor para loguearse en Booking.com.
 *
 */

import com.devco.certification.booking.models.UserModel;
import com.devco.certification.booking.tasks.GetIntoSign;
import com.devco.certification.booking.tasks.OpenTheBrowser;
import com.devco.certification.booking.tasks.SignInWith;
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

public class LoginStepDefinitions {

    @Managed(driver = "chrome",
            clearCookies=BeforeEachTest)
    private WebDriver hisBrowser;

    private Actor user = Actor.named("user");

    private BookingHomePage bookingHomePage;

    @Before
    public void setUp() {
        user.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^that user wants to sign in on Booking.com$")
    public void thatUserWantsToSignInOnBookingCom() {
        user.attemptsTo(OpenTheBrowser.on(bookingHomePage));
    }

    @When("^user clicks on Login button$")
    public void userClicksOnLoginButton() {
        user.attemptsTo(GetIntoSign.InPage());
    }

    @When("^he enters the username and password$")
    public void heEntersTheUsernameAndPassword(List<UserModel> credentials) {
        user.attemptsTo(SignInWith.access(credentials.get(0)));
    }

    @Then("^user should see the captcha message$")
    public void userShouldSeeTheCaptchaMessage() {
        user.should(seeThat(LoginCaptchaMessage.isDisplayed()));
    }

}
