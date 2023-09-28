/** GitHub de Luis Ruiz: https://github.com/riplui5
 GitHub de Christopher Paez: https://github.com/CHRISTOPHERP43Z
 */
package com.devco.certification.booking.models;

/**
 * Clase que representa un modelo de reserva de taxi.
 */
public class CabModel {

    /**
     * El lugar de origen de la reserva de taxi.
     */
    private String origin;

    /**
     * El lugar de destino de la reserva de taxi.
     */
    private String dropOff;

    /**
     * La fecha de la reserva de taxi.
     */
    private String date;

    /**
     * La hora de recogida de la reserva de taxi (hora).
     */
    private String pickUpHour;

    /**
     * La hora de recogida de la reserva de taxi (minutos).
     */
    private String pickUpMin;

    /**
     * El número de pasajeros en la reserva de taxi.
     */
    private String passengers;

    /**
     * Constructor de la clase CabModel.
     *
     * @param origin     El lugar de origen de la reserva de taxi.
     * @param dropOff    El lugar de destino de la reserva de taxi.
     * @param date       La fecha de la reserva de taxi.
     * @param pickUpHour La hora de recogida de la reserva de taxi (hora).
     * @param pickUpMin  La hora de recogida de la reserva de taxi (minutos).
     * @param passengers El número de pasajeros en la reserva de taxi.
     */
    public CabModel(String origin, String dropOff, String date, String pickUpHour, String pickUpMin, String passengers) {
        this.origin = origin;
        this.dropOff = dropOff;
        this.date = date;
        this.pickUpHour = pickUpHour;
        this.pickUpMin = pickUpMin;
        this.passengers = passengers;
    }

    /**
     * Obtiene el lugar de origen de la reserva de taxi.
     *
     * @return El lugar de origen de la reserva de taxi.
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * Establece el lugar de origen de la reserva de taxi.
     *
     * @param origin El lugar de origen de la reserva de taxi.
     */
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    /**
     * Obtiene el lugar de destino de la reserva de taxi.
     *
     * @return El lugar de destino de la reserva de taxi.
     */
    public String getDropOff() {
        return dropOff;
    }

    /**
     * Establece el lugar de destino de la reserva de taxi.
     *
     * @param dropOff El lugar de destino de la reserva de taxi.
     */
    public void setDropOff(String dropOff) {
        this.dropOff = dropOff;
    }

    /**
     * Obtiene la fecha de la reserva de taxi.
     *
     * @return La fecha de la reserva de taxi.
     */
    public String getDate() {
        return date;
    }

    /**
     * Establece la fecha de la reserva de taxi.
     *
     * @param date La fecha de la reserva de taxi.
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * Obtiene la hora de recogida de la reserva de taxi (hora).
     *
     * @return La hora de recogida de la reserva de taxi (hora).
     */
    public String getPickUpHour() {
        return pickUpHour;
    }

    /**
     * Establece la hora de recogida de la reserva de taxi (hora).
     *
     * @param pickUpHour La hora de recogida de la reserva de taxi (hora).
     */
    public void setPickUpHour(String pickUpHour) {
        this.pickUpHour = pickUpHour;
    }

    /**
     * Obtiene la hora de recogida de la reserva de taxi (minutos).
     *
     * @return La hora de recogida de la reserva de taxi (minutos).
     */
    public String getPickUpMin() {
        return pickUpMin;
    }

    /**
     * Establece la hora de recogida de la reserva de taxi (minutos).
     *
     * @param pickUpMin La hora de recogida de la reserva de taxi (minutos).
     */
    public void setPickUpMin(String pickUpMin) {
        this.pickUpMin = pickUpMin;
    }

    /**
     * Obtiene el número de pasajeros en la reserva de taxi.
     *
     * @return El número de pasajeros en la reserva de taxi.
     */
    public String getPassengers() {
        return passengers;
    }

    /**
     * Establece el número de pasajeros en la reserva de taxi.
     *
     * @param passengers El número de pasajeros en la reserva de taxi.
     */
    public void setPassengers(String passengers) {
        this.passengers = passengers;
    }
}
