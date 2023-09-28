/**
 * Autores: Luis Ruiz y Christopher Paez
 * La clase HotelBookingTest contiene pruebas para la página de reserva de hoteles en booking.com.
 */
package tests;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import java.time.LocalDate;
import pages.HotelBookingPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HotelBookingTest {
    private WebDriver driver;

    /**
     *  WebDriver antes de cada prueba.
     */
    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
        driver = new ChromeDriver();
    }

    /**
     * Prueba el proceso de reserva de un hotel.
     */
    @Test
    public void testHotelBooking() {
        HotelBookingPage hotelBookingPage = new HotelBookingPage(driver);

        // parámetros de la reserva
        hotelBookingPage.setCheckInDate(LocalDate.now().plusDays(2));
        hotelBookingPage.setCheckOutDate(LocalDate.now().plusDays(7));
        hotelBookingPage.setRooms(2);
        hotelBookingPage.setAdults(3);
        hotelBookingPage.setChildren(2);
        hotelBookingPage.setPriceRange(200);
        hotelBookingPage.setStars(3);

        // Aplica los filtros y selecciona el hotel más barato
        hotelBookingPage.applyFilters();
        hotelBookingPage.selectCheapestHotel();
    }

    /**
     * Cierra el WebDriver después de cada prueba.
     */
    @After
    public void tearDown() {
        driver.quit();
    }
}
