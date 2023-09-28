package com.devco.certification.booking.tasks;

import com.devco.certification.booking.models.UserModel;
import com.devco.certification.booking.userinterfaces.RegisterPage;
import com.devco.certification.booking.userinterfaces.LoginPage; // Importar la clase LoginPage
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

/**
 * Esta clase representa una tarea en la que un actor crea una cuenta en Booking.com con las credenciales proporcionadas.
 */
public class CreateAnAccountWith implements Task {

    private UserModel userModel;

    public CreateAnAccountWith(UserModel userModel) {
        this.userModel = userModel;
    }

    @Override
    @Step("{0} Crea una cuenta")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(userModel.getUsername()).into(RegisterPage.USERNAME),
                Click.on(RegisterPage.CONTINUE_BUTTON),
                WaitUntil.the(RegisterPage.NEW_PASSWORD, isVisible()),
                Enter.theValue(userModel.getPassword()).into(RegisterPage.NEW_PASSWORD),
                Enter.theValue(userModel.getPassword()).into(RegisterPage.C_NEW_PASSWORD),
                Click.on(RegisterPage.CREATE_ACCOUNT_BUTTON),
                Click.on(LoginPage.POP_BAD.resolveFor(actor)) // Agregar esta línea para hacer clic en POP_BAD
        );
    }

    /**
     * Método estático que proporciona una instancia de esta tarea para su uso en las interacciones del actor.
     *
     * @param userModel El modelo de usuario que contiene las credenciales para crear la cuenta.
     * @return Una instancia de la tarea CreateAnAccountWith.
     */
    public static CreateAnAccountWith credentials(UserModel userModel) {
        return instrumented(CreateAnAccountWith.class, userModel);
    }
}
