package com.devco.certification.booking.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

/**
 * Esta clase representa la página de búsqueda de autos en Booking.com.
 */
public class CarSearchPage extends PageObject {

    /**
     * Target para el cuadro de texto de origen (pickup).
     */
    public static final Target PICKUP = Target.the("pickup text box").located(By.name("ss_origin"));

    /**
     * Target para la ubicación de origen seleccionada.
     */
    public static final Target PICKUP_SLC = Target.the("pickup location").located(By.xpath("//*[@id=\"frm\"]/div[2]/div[1]/div/div[1]/ul[1]/li"));

    /**
     * Target para el botón del calendario de selección de fecha.
     */
    public static final Target DATE_PICK = Target.the("calendar").located(By.xpath("//*[@aria-label = 'Abrir el calendario']"));

    /**
     * Target para seleccionar una fecha específica en el calendario.
     */
    public static final Target F_DATE = Target.the("date").locatedBy("//*[text()='18'][1]");

    /**
     * Target para el botón de búsqueda.
     */
    public static final Target SEARCH_BTN = Target.the("search button").located(By.xpath("//*[@id=\"frm\"]/div[2]/div[4]/div[2]/button"));

    /**
     * Target para el botón de cierre emergente (POP Bad).
     */
    public static final Target POP_BAD = Target.the("POP Bad")
            .locatedBy("//*[@id=\"b2indexPage\"]/div[17]/div/div/div/div[1]/div[1]/div/button");
}
