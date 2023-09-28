package com.devco.certification.booking.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

/**
 * Esta clase representa la página de búsqueda de taxis en Booking.com.
 */
public class CabSearchPage extends PageObject {

    /**
     * Target para el cuadro de texto de origen (pickup).
     */
    public static final Target ORIGIN_TXT = Target.the("pickup text box").located(By.id("pickupLocation"));

    /**
     * Target para la ubicación de origen seleccionada.
     */
    public static final Target ORIGIN_SLCTN = Target.the("pickup location").located(By.xpath("//*[@id=\"pickupLocation-items\"]/li[2]/button/div/h4"));

    /**
     * Target para el cuadro de texto de destino (drop-off).
     */
    public static final Target DROP_OFF_TXT = Target.the("drop off text box").located(By.id("dropoffLocation"));

    /**
     * Target para la ubicación de destino seleccionada.
     */
    public static final Target DROP_OFF_SLCTN = Target.the("drop off location").located(By.xpath("//*[@id=\"dropoffLocation-items\"]/li[2]/button/div/h4"));

    /**
     * Target para el botón del calendario de selección de fecha.
     */
    public static final Target DATE_BTN = Target.the("calendar").located(By.xpath("//*[@id=\"booking-taxi-searchbar__container\"]/div/div/div/form/div[2]/div[1]/div[2]/div/div/div[1]/div/button"));

    /**
     * Target para seleccionar una fecha específica en el calendario.
     */
    public static Target DATE = Target.the("date").locatedBy("//*[@aria-label = '{0}']");

    /**
     * Target para el botón de selección de hora de recogida (pick-up).
     */
    public static final Target PICK_UP_TIME = Target.the("pick up time").located(By.xpath("//*[@id=\"booking-taxi-searchbar__container\"]/div/div/div/form/div[2]/div[1]/div[2]/div/div/div[2]/div/div[1]/div/button"));

    /**
     * Target para seleccionar la hora de recogida.
     */
    public static final Target PICK_UP_HOUR = Target.the("pick up hour").located(By.id("pickupHour"));

    /**
     * Target para seleccionar los minutos de recogida.
     */
    public static final Target PICK_UP_MIN = Target.the("pick up min").located(By.id("pickupMinute"));

    /**
     * Target para el botón de confirmación.
     */
    public static final Target CONFIRM_BTN = Target.the("confirm button").located(By.xpath("//*[@id=\"booking-taxi-searchbar__container\"]/div/div/div/form/div[2]/div[1]/div[2]/div/div/div[2]/div/div[1]/div/div/div/div/div/div/div/button"));

    /**
     * Target para seleccionar la cantidad de pasajeros.
     */
    public static final Target PASSENGERS = Target.the("passengers").located(By.id("passengers"));

    /**
     * Target para el botón de búsqueda.
     */
    public static final Target SEARCH_BTN = Target.the("search button").located(By.name("searchButton"));

    /**
     * Target para el botón de cierre emergente (POP Bad).
     */
    public static final Target POP_BAD = Target.the("POP Bad")
            .locatedBy("//*[@id=\"b2indexPage\"]/div[17]/div/div/div/div[1]/div[1]/div/button");
}
