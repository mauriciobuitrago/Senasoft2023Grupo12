/** GitHub de Luis Ruiz: https://github.com/riplui5
 GitHub de Christopher Paez: https://github.com/CHRISTOPHERP43Z
 */
package com.devco.certification.booking.exceptions;

/**
 * Excepción personalizada que se lanza cuando no hay conexión a Internet.
 */
public class NoInternetConnection extends AssertionError {

    private static final long serialVersionUID = 1L;

    /**
     * Mensaje de error para la falta de conexión a Internet.
     */
    public static final String NO_INTERNET_CONNECTION_MESSAGE = "No internet connection";

    /**
     * Constructor que permite especificar un mensaje de error personalizado y una causa.
     *
     * @param message El mensaje de error personalizado.
     * @param cause   La causa de la excepción.
     */
    public NoInternetConnection(String message, Throwable cause) {
        super(message, cause);
    }
}
