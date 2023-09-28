package com.devco.certification.booking.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

/**
 * Esta clase representa la página de búsqueda de taxis (SearchingCabsPage) en Booking.com.
 */
public class SearchingCabsPage extends PageObject {

    /**
     * Target para la pantalla de búsqueda de taxis.
     */
    public static final Target SEARCHING_SCREEN = Target.the("searching screen").located(By.xpath("/html/body/div[1]/div[2]/div/h1"));

    /**
     * Target para el botón de cierre emergente (POP Bad).
     */
    public static final Target POP_BAD = Target.the("POP Bad")
            .locatedBy("//*[@id=\"b2indexPage\"]/div[17]/div/div/div/div[1]/div[1]/div/button");
}
