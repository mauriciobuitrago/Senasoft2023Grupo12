package com.devco.certification.booking.questions;
/** GitHub de Luis Ruiz: https://github.com/riplui5
 * GitHub de Christopher Paez: https://github.com/CHRISTOPHERP43Z
 */
import com.devco.certification.booking.userinterfaces.CabSearchPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Visibility;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

/**
 * Clase que verifica si el elemento POP_BAD es visible en la página de búsqueda de taxi y lo cierra si está presente.
 */
public class IsPopBadVisible implements Question<Boolean> {

    /**
     * Verifica si el elemento POP_BAD es visible en la página de búsqueda de taxi y lo cierra si está presente.
     *
     * @param actor El actor que realiza la acción.
     * @return {@code true} si el elemento POP_BAD es visible (o si se cerró); {@code false} de lo contrario.
     */
    @Override
    public Boolean answeredBy(Actor actor) {
        if (Visibility.of(CabSearchPage.POP_BAD).viewedBy(actor).asBoolean()) {
            actor.attemptsTo(
                    Click.on(CabSearchPage.POP_BAD)
            );
            return true; // Devuelve true si se cerró el pop-up
        }
        return false; // Devuelve false si el pop-up no está presente
    }

    /**
     * Crea una instancia de la pregunta para verificar si el elemento POP_BAD está visible y cerrarlo si es necesario.
     *
     * @return Una instancia de {@code IsPopBadVisible}.
     */
    public static IsPopBadVisible onPage() {
        return new IsPopBadVisible();
    }
}
