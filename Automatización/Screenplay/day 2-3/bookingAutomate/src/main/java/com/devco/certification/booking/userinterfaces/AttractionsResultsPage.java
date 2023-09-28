package com.devco.certification.booking.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

/**
 * Esta clase representa la página de resultados de atracciones en Booking.com.
 */
public class AttractionsResultsPage extends PageObject {

    /**
     * Target para seleccionar una categoría de atracción específica en la página de resultados.
     */
    public static Target CATEGORY = Target.the("category").locatedBy("//*[text()='{0}']");

    /**
     * Target para seleccionar la primera opción en la lista de atracciones.
     */
    public static final Target OPTION = Target.the("option").located(By.xpath("//*[@class='css-xbcz3d'][1]"));

    /**
     * Target para el botón de cierre emergente (POP Bad).
     */
    public static final Target POP_BAD = Target.the("POP Bad")
            .locatedBy("//*[@id=\"b2indexPage\"]/div[17]/div/div/div/div[1]/div[1]/div/button");
}
