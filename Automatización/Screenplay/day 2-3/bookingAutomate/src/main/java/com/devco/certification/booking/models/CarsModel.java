package com.devco.certification.booking.models;

/**
 * Clase que representa un modelo de coches.
 *
 * GitHub de Luis Ruiz: https://github.com/riplui5
 * GitHub de Christopher Paez: https://github.com/CHRISTOPHERP43Z
 */
public class CarsModel {

    /**
     * La ubicación del coche.
     */
    private String loc;

    /**
     * Constructor de la clase CarsModel.
     *
     * @param loc La ubicación del coche.
     */
    public CarsModel(String loc) {
        this.loc = loc;
    }

    /**
     * Obtiene la ubicación del coche.
     *
     * @return La ubicación del coche.
     */
    public String getLoc() {
        return loc;
    }

    /**
     * Establece la ubicación del coche.
     *
     * @param loc La ubicación del coche.
     */
    public void setLoc(String loc) {
        this.loc = loc;
    }
}
