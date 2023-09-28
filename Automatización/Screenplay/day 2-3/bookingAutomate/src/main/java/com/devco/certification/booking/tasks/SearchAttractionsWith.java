package com.devco.certification.booking.tasks;


import com.devco.certification.booking.models.AttractionsModel;
import com.devco.certification.booking.userinterfaces.AttractionsSearchPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SearchAttractionsWith implements Task {

    private AttractionsModel attractionsModel;

    public SearchAttractionsWith(AttractionsModel attractionsModel) {
        this.attractionsModel = attractionsModel;
    }

    @Override
    @Step("{0} Enters attractions preferences")
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Enter.theValue(attractionsModel.getPlace()).into(AttractionsSearchPage.ATTRACTION_TXT),
                WaitUntil.the(AttractionsSearchPage.SEARCH_BTN, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(AttractionsSearchPage.SEARCH_BTN));

    }

    public static SearchAttractionsWith his(AttractionsModel attractionsModel) {
        return instrumented(SearchAttractionsWith.class, attractionsModel);
    }

}
