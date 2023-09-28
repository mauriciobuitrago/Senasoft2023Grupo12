package com.devco.certification.booking.models;

/**
 * Clase que representa un modelo de usuario.
 *
 * GitHub de Luis Ruiz: https://github.com/riplui5
 * GitHub de Christopher Paez: https://github.com/CHRISTOPHERP43Z
 */
public class UserModel {

    /**
     * El nombre de usuario.
     */
    private String username;

    /**
     * La contraseña del usuario.
     */
    private String password;

    /**
     * Constructor de la clase UserModel.
     *
     * @param username El nombre de usuario.
     * @param password La contraseña del usuario.
     */
    public UserModel(String username, String password) {
        this.username = username;
        this.password = password;
    }

    /**
     * Obtiene el nombre de usuario.
     *
     * @return El nombre de usuario.
     */
    public String getUsername() {
        return username;
    }

    /**
     * Establece el nombre de usuario.
     *
     * @param username El nombre de usuario.
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Obtiene la contraseña del usuario.
     *
     * @return La contraseña del usuario.
     */
    public String getPassword() {
        return password;
    }

    /**
     * Establece la contraseña del usuario.
     *
     * @param password La contraseña del usuario.
     */
    public void setPassword(String password) {
        this.password = password;
    }
}
