package com.devco.certification.booking.tasks;

import com.devco.certification.booking.userinterfaces.BookingHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

/**
 * Esta clase representa una tarea en la que un actor accede a la página de búsqueda de autos en Booking.com.
 */
public class GetIntoCars implements Task {
    @Override
    @Step("{0} Accede a la página de búsqueda de autos")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BookingHomePage.CARS_BTN));
    }

    /**
     * Método estático que proporciona una instancia de esta tarea para su uso en las interacciones del actor.
     *
     * @return Una instancia de la tarea GetIntoCars.
     */
    public static GetIntoCars page(){
        return instrumented(GetIntoCars.class);
    }
}
