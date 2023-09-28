package com.devco.certification.booking.tasks;


import com.devco.certification.booking.userinterfaces.BookingHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GetIntoCars implements Task {
    @Override
    @Step("{0} Get into cars search page")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BookingHomePage.CARS_BTN));
    }

    public static GetIntoCars page(){
        return instrumented(GetIntoCars.class);
    }
}
