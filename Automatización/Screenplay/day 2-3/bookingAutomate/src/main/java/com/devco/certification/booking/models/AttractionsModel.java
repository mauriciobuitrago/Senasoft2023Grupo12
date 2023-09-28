/** GitHub de Luis Ruiz: https://github.com/riplui5
 GitHub de Christopher Paez: https://github.com/CHRISTOPHERP43Z
 */
package com.devco.certification.booking.models;

/**
 * Clase que representa un modelo de atracción.
 */
public class AttractionsModel {

    /**
     * El nombre del lugar de la atracción.
     */
    private String place;

    /**
     * La categoría de la atracción.
     */
    private String category;

    /**
     * Constructor de la clase AttractionsModel.
     *
     * @param place    El nombre del lugar de la atracción.
     * @param category La categoría de la atracción.
     */
    public AttractionsModel(String place, String category) {
        this.place = place;
        this.category = category;
    }

    /**
     * Obtiene el nombre del lugar de la atracción.
     *
     * @return El nombre del lugar de la atracción.
     */
    public String getPlace() {
        return place;
    }

    /**
     * Establece el nombre del lugar de la atracción.
     *
     * @param place El nombre del lugar de la atracción.
     */
    public void setPlace(String place) {
        this.place = place;
    }

    /**
     * Obtiene la categoría de la atracción.
     *
     * @return La categoría de la atracción.
     */
    public String getCategory() {
        return category;
    }

    /**
     * Establece la categoría de la atracción.
     *
     * @param category La categoría de la atracción.
     */
    public void setCategory(String category) {
        this.category = category;
    }
}
