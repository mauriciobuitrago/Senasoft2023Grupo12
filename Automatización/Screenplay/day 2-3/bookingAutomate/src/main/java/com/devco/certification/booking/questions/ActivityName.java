package com.devco.certification.booking.questions;

import com.devco.certification.booking.userinterfaces.SelectedAttractionPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

/**
 * Clase que verifica si el nombre de la actividad está visible en la página de atracción seleccionada.
 */
public class ActivityName implements Question<Boolean> {

    /**
     * Verifica si el nombre de la actividad está visible.
     *
     * @param actor El actor que realiza la acción.
     * @return {@code true} si el nombre de la actividad está visible; {@code false} de lo contrario.
     */
    @Override
    public Boolean answeredBy(Actor actor) {
        return the(SelectedAttractionPage.ACTIVITY_NAME).answeredBy(actor).isCurrentlyVisible();
    }

    /**
     * Crea una instancia de la pregunta para verificar si el nombre de la actividad está desplegado.
     *
     * @return Una instancia de {@code ActivityName}.
     */
    public static Question<Boolean> isDisplayed() {
        return new ActivityName();
    }
}
