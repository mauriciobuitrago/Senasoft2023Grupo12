package com.devco.certification.booking.tasks;

import com.devco.certification.booking.userinterfaces.BookingHomePage;
import com.devco.certification.booking.userinterfaces.LoginPage; // Importar la clase LoginPage
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

/**
 * Esta clase representa una tarea en la que un actor accede a la página de registro en Booking.com.
 */
public class GetIntoRegister implements Task {

    @Override
    @Step("{0} Accede a la página de registro")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BookingHomePage.MAKE_ACCOUNT_BUTTON),
                Click.on(LoginPage.POP_BAD.resolveFor(actor)) // Agregar esta línea para hacer clic en POP_BAD
        );
    }

    /**
     * Método estático que proporciona una instancia de esta tarea para su uso en las interacciones del actor.
     *
     * @return Una instancia de la tarea GetIntoRegister.
     */
    public static GetIntoRegister Page(){
        return instrumented(GetIntoRegister.class);
    }
}
