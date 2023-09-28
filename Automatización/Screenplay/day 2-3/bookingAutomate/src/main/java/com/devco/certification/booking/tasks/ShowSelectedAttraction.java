package com.devco.certification.booking.tasks;


import com.devco.certification.booking.userinterfaces.SelectedAttractionPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ShowSelectedAttraction implements Task {
    @Override
    @Step("{0} Scrolls to description")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(SelectedAttractionPage.ACTIVITY_NAME, isVisible()).forNoMoreThan(10).seconds(),
                Scroll.to(SelectedAttractionPage.ACTIVITY_NAME));
    }

    public static ShowSelectedAttraction description(){
        return instrumented(ShowSelectedAttraction.class);
    }
}
