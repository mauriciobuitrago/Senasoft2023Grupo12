package com.devco.certification.booking.tasks;

import com.devco.certification.booking.userinterfaces.BookingHomePage;
import com.devco.certification.booking.userinterfaces.LoginPage; // Importar la clase LoginPage
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GetIntoRegister implements Task {

    @Override
    @Step("{0} Get into register page")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BookingHomePage.MAKE_ACCOUNT_BUTTON),
                Click.on(LoginPage.POP_BAD.resolveFor(actor)) // Agregar esta línea para hacer clic en POP_BAD
        );
    }

    public static GetIntoRegister Page(){
        return instrumented(GetIntoRegister.class);
    }
}

