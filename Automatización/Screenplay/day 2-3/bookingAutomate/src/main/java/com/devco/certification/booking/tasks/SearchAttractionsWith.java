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

/**
 * Esta clase representa una tarea en la que un actor ingresa las preferencias de búsqueda de atracciones en Booking.com.
 */
public class SearchAttractionsWith implements Task {

    private AttractionsModel attractionsModel;

    public SearchAttractionsWith(AttractionsModel attractionsModel) {
        this.attractionsModel = attractionsModel;
    }

    @Override
    @Step("{0} Ingresa las preferencias de atracciones")
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(attractionsModel.getPlace()).into(AttractionsSearchPage.ATTRACTION_TXT),
                WaitUntil.the(AttractionsSearchPage.SEARCH_BTN, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(AttractionsSearchPage.SEARCH_BTN)
        );

    }

    /**
     * Método estático que proporciona una instancia de esta tarea para su uso en las interacciones del actor.
     *
     * @param attractionsModel El modelo de atracciones que contiene las preferencias de búsqueda.
     * @return Una instancia de la tarea SearchAttractionsWith.
     */
    public static SearchAttractionsWith his(AttractionsModel attractionsModel) {
        return instrumented(SearchAttractionsWith.class, attractionsModel);
    }
}
