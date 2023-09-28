package com.devco.certification.booking.questions;
/** GitHub de Luis Ruiz: https://github.com/riplui5
 * GitHub de Christopher Paez: https://github.com/CHRISTOPHERP43Z
 */
import com.devco.certification.booking.userinterfaces.BookingHomePage;
import com.devco.certification.booking.userinterfaces.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

/**
 * Clase que verifica si la página de inicio de Booking.com es visible y hace clic en un elemento si está presente.
 */
public class BookingVisiblePage implements Question<Boolean> {

    /**
     * Verifica si la página de inicio de Booking.com es visible y hace clic en un elemento si está presente.
     *
     * @param actor El actor que realiza la acción.
     * @return {@code true} si la página de inicio es visible; {@code false} de lo contrario.
     */
    @Override
    public Boolean answeredBy(Actor actor) {
        // Verificar la visibilidad del elemento SEARCH_BUTTON en la página de inicio
        boolean isSearchButtonVisible = the(BookingHomePage.SEARCH_BUTTON).answeredBy(actor).isCurrentlyVisible();

        // Hacer clic en el elemento POP_BAD en la página de inicio de sesión si el botón de búsqueda es visible
        if (isSearchButtonVisible) {
            if (the(LoginPage.POP_BAD).answeredBy(actor).isCurrentlyVisible()) {
                actor.attemptsTo(
                        Click.on(LoginPage.POP_BAD)
                );
            }
        }

        return isSearchButtonVisible;
    }

    /**
     * Crea una instancia de la pregunta para verificar la visibilidad de la página de inicio de Booking.com.
     *
     * @return Una instancia de {@code BookingVisiblePage}.
     */
    public static Question<Boolean> isVisible() {
        return new BookingVisiblePage();
    }
}
