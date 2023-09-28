package com.devco.certification.booking.tasks;

import com.devco.certification.booking.userinterfaces.SelectedAttractionPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

/**
 * Esta clase representa una tarea en la que un actor muestra la descripción de la atracción seleccionada.
 */
public class ShowSelectedAttraction implements Task {
    @Override
    @Step("{0} Desplaza hasta la descripción")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(SelectedAttractionPage.ACTIVITY_NAME, isVisible()).forNoMoreThan(10).seconds(),
                Scroll.to(SelectedAttractionPage.ACTIVITY_NAME)
        );
    }

    /**
     * Método estático que proporciona una instancia de esta tarea para su uso en las interacciones del actor.
     *
     * @return Una instancia de la tarea ShowSelectedAttraction.
     */
    public static ShowSelectedAttraction description(){
        return instrumented(ShowSelectedAttraction.class);
    }
}
