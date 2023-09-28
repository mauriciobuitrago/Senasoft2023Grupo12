package com.devco.certification.booking.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

/**
 * Esta clase representa la página de búsqueda de atracciones en Booking.com.
 */
public class AttractionsSearchPage extends PageObject {

    /**
     * Target para el cuadro de texto de búsqueda de atracciones.
     */
    public static final Target ATTRACTION_TXT = Target.the("search text box").located(By.name("query"));

    /**
     * Target para el botón de búsqueda en la página de atracciones.
     */
    public static final Target SEARCH_BTN = Target.the("search button").located(By.xpath("//*[text()='Buscar']"));

    /**
     * Target para el botón de cierre emergente (POP Bad).
     */
    public static final Target POP_BAD = Target.the("POP Bad")
            .locatedBy("//*[@id=\"b2indexPage\"]/div[17]/div/div/div/div[1]/div[1]/div/button");
}
