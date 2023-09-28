package com.devco.certification.booking.tasks;

import com.devco.certification.booking.models.UserModel;
import com.devco.certification.booking.userinterfaces.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

/**
 * Esta clase representa una tarea en la que un actor inicia sesión en Booking.com con un usuario y contraseña.
 */
public class SignInWith implements Task {

    private UserModel userModel;

    public SignInWith(UserModel userModel) {
        this.userModel = userModel;
    }

    @Override
    @Step("{0} Inicia sesión en Booking.com")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(userModel.getUsername()).into(LoginPage.USERNAME),
                Click.on(LoginPage.CONTINUE_BUTTON),
                WaitUntil.the(LoginPage.PASSWORD, isVisible()),
                Enter.theValue(userModel.getPassword()).into(LoginPage.PASSWORD),
                Click.on(LoginPage.LOGIN_BUTTON1),
                Click.on(LoginPage.POP_BAD.resolveFor(actor))
        );
    }

    /**
     * Método estático que proporciona una instancia de esta tarea para su uso en las interacciones del actor.
     *
     * @param userModel El modelo de usuario que contiene las credenciales de inicio de sesión.
     * @return Una instancia de la tarea SignInWith.
     */
    public static SignInWith access(UserModel userModel) {
        return instrumented(SignInWith.class, userModel);
    }
}
