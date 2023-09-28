package com.devco.certification.booking.tasks;


import com.devco.certification.booking.userinterfaces.AttractionsResultsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SelectFirst implements Task {
    @Override
    @Step("{0} Selects the first option")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(AttractionsResultsPage.OPTION, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(AttractionsResultsPage.OPTION));
    }

    public static SelectFirst activityFromResults(){
        return instrumented(SelectFirst.class);

    }
}
