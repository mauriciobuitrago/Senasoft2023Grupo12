package com.devco.certification.booking.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

/**
 * Esta clase representa la página de inicio de sesión (LoginPage) en Booking.com.
 */
public class LoginPage extends PageObject {

    /**
     * Target para el campo de nombre de usuario.
     */
    public static final Target USERNAME = Target.the("username").located(By.name("username"));

    /**
     * Target para el botón "Continuar con e-mail".
     */
    public static final Target CONTINUE_BUTTON = Target.the("continue button").located(By.xpath("//*[text()='Continuar con e-mail']"));

    /**
     * Target para el campo de contraseña.
     */
    public static final Target PASSWORD = Target.the("password").located(By.name("password"));

    /**
     * Target para el botón de inicio de sesión.
     */
    public static final Target LOGIN_BUTTON1 = Target.the("login button").located(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[1]/div/div/div/div/div/div/form/button"));

    /**
     * Target para el título de captcha.
     */
    public static final Target CAPTCHA_TITTLE = Target.the("captcha tittle").located(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[1]/div/div/div/div/div/div/form/div[2]/h3"));

    /**
     * Target para el botón de cierre emergente (POP Bad).
     */
    public static final Target POP_BAD = Target.the("POP Bad")
            .locatedBy("//*[@id=\"b2indexPage\"]/div[17]/div/div/div/div[1]/div[1]/div/button");
}
