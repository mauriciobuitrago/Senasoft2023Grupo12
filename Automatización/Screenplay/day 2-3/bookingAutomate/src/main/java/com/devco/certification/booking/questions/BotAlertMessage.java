package com.devco.certification.booking.questions;
/** GitHub de Luis Ruiz: https://github.com/riplui5
 * GitHub de Christopher Paez: https://github.com/CHRISTOPHERP43Z
 */
import com.devco.certification.booking.userinterfaces.InterruptionPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

/**
 * Clase que verifica si el mensaje de alerta del bot está visible en la página de interrupción.
 */
public class BotAlertMessage implements Question<Boolean> {

    /**
     * Verifica si el mensaje de alerta del bot está visible en la página de interrupción.
     *
     * @param actor El actor que realiza la acción.
     * @return {@code true} si el mensaje de alerta del bot está visible; {@code false} de lo contrario.
     */
    @Override
    public Boolean answeredBy(Actor actor) {
        return the(InterruptionPage.BOT_ALERT).answeredBy(actor).isCurrentlyVisible();
    }

    /**
     * Crea una instancia de la pregunta para verificar si el mensaje de alerta del bot está desplegado.
     *
     * @return Una instancia de {@code BotAlertMessage}.
     */
    public static Question<Boolean> isDisplayed(){
        return new BotAlertMessage();
    }
}
