package com.devco.certification.booking.tasks;


import com.devco.certification.booking.exceptions.NoInternetConnection;
import com.devco.certification.booking.questions.BookingVisiblePage;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenTheBrowser implements Task {

    private PageObject page;

    public OpenTheBrowser(PageObject page) {
        this.page = page;
    }

    @Override
    @Step("{0} Opens the browser on Booking.com home page")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(page));
        actor.should(seeThat(BookingVisiblePage.isVisible()).orComplainWith(NoInternetConnection.class,
                getNoInternetConnectionMessage()));
    }

    public String getNoInternetConnectionMessage() {
        return String.format(NoInternetConnection.NO_INTERNET_CONNECTION_MESSAGE);
    }

    public static OpenTheBrowser on(PageObject page) {
        return instrumented(OpenTheBrowser.class, page);
    }
}