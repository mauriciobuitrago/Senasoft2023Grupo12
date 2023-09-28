package com.devco.certification.booking.questions;

import com.devco.certification.booking.userinterfaces.SearchingCabsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

/**
 * Esta clase representa una pregunta que verifica si la pantalla de búsqueda de taxis
 * en la aplicación de Booking.com está actualmente visible.
 */
public class SearchingCabsScreen implements Question<Boolean> {

    // Método para responder a la pregunta
    @Override
    public Boolean answeredBy(Actor actor) {
        // Utiliza la clase WebElementQuestion de Serenity para verificar si la pantalla de búsqueda de taxis
        // está actualmente visible para el actor.
        return the(SearchingCabsPage.SEARCHING_SCREEN).answeredBy(actor).isCurrentlyVisible();
    }

    /**
     * Método estático que proporciona una instancia de esta pregunta para su uso en las interacciones del actor.
     *
     * @return Una instancia de la pregunta SearchingCabsScreen.
     */
    public static Question<Boolean> isDisplayed() {
        return new SearchingCabsScreen();
    }
}
