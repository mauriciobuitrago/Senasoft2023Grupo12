package com.devco.certification.booking.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

/**
 * Esta clase representa la página de la atracción seleccionada (SelectedAttractionPage) en Booking.com.
 */
public class SelectedAttractionPage extends PageObject {

    /**
     * Target para el nombre de la actividad en la página de la atracción seleccionada.
     */
    public static final Target ACTIVITY_NAME = Target.the("activity name").located(By.xpath("//h2[contains(@class,'css-1uk1gs8')]"));

    /**
     * Target para el botón de cierre emergente (POP Bad).
     */
    public static final Target POP_BAD = Target.the("POP Bad")
            .locatedBy("//*[@id=\"b2indexPage\"]/div[17]/div/div/div/div[1]/div[1]/div/button");
}
