/**
 * Autores: Luis Ruiz y Christopher Paez
 * Representa la página de reserva de hoteles en booking.com.
 */
package pages;

import java.time.LocalDate;
import org.openqa.selenium.WebDriver;

public class HotelBookingPage {
    private WebDriver driver;

    /**
     * Inicializa el WebDriver y abre la página de booking.com.
     */
    public HotelBookingPage(WebDriver driver) {
        this.driver = driver;
        driver.get("https://www.booking.com");
    }

    // Métodos para establecer los parámetros de la reserva
    public void setCheckInDate(LocalDate date) {}
    public void setCheckOutDate(LocalDate date) {}
    public void setRooms(int rooms) {}
    public void setAdults(int adults) {}
    public void setChildren(int children) {}
    public void setPriceRange(int minPrice) {}
    public void setStars(int minStars) {}

    /**
     * Aplica los filtros seleccionados en la página de reserva.
     */
    public void applyFilters() {}

    /**
     * Selecciona el hotel más económico que cumpla con los filtros aplicados.
     */
    public void selectCheapestHotel() {}
}
