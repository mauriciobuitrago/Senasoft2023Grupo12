package com.devco.certification.booking.tasks;

import com.devco.certification.booking.models.AttractionsModel;
import com.devco.certification.booking.userinterfaces.AttractionsResultsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

/**
 * Esta clase representa una tarea en la que un actor elige una atracción en la página de resultados de atracciones en Booking.com.
 */
public class ChooseAttraction implements Task {

    private AttractionsModel attractionsModel;

    public ChooseAttraction(AttractionsModel attractionsModel) {
        this.attractionsModel = attractionsModel;
    }

    @Override
    @Step("{0} Elige una atracción")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(AttractionsResultsPage.CATEGORY.of(attractionsModel.getCategory())));
    }

    /**
     * Método estático que proporciona una instancia de esta tarea para su uso en las interacciones del actor.
     *
     * @param attractionsModel El modelo de atracciones que contiene la categoría de la atracción que se va a elegir.
     * @return Una instancia de la tarea ChooseAttraction.
     */
    public static ChooseAttraction category(AttractionsModel attractionsModel){
        return instrumented(ChooseAttraction.class, attractionsModel);
    }
}
