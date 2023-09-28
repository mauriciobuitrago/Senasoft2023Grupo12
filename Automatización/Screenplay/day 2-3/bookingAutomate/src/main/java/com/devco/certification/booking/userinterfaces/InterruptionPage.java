package com.devco.certification.booking.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

/**
 * Esta clase representa la página de interrupción (InterruptionPage) en Booking.com.
 */
public class InterruptionPage extends PageObject {

    /**
     * Target para la alerta de bot (bot alert).
     */
    public static final Target BOT_ALERT = Target.the("bot alert").located(By.xpath("/html/body/div/h1"));

    /**
     * Target para el botón de cierre emergente (POP Bad).
     */
    public static final Target POP_BAD = Target.the("POP Bad")
            .locatedBy("//*[@id=\"b2indexPage\"]/div[17]/div/div/div/div[1]/div[1]/div/button");
}
