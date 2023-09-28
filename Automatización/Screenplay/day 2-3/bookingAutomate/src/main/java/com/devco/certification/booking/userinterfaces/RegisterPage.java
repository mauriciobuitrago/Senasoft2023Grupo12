package com.devco.certification.booking.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

/**
 * Esta clase representa la página de registro (RegisterPage) en Booking.com.
 */
public class RegisterPage extends PageObject {

    /**
     * Target para el campo de nombre de usuario.
     */
    public static final Target USERNAME = Target.the("username").located(By.name("username"));

    /**
     * Target para el botón "Continuar con e-mail".
     */
    public static final Target CONTINUE_BUTTON = Target.the("continue button").located(By.xpath("//*[text()='Continuar con e-mail']"));

    /**
     * Target para el campo de nueva contraseña.
     */
    public static final Target NEW_PASSWORD = Target.the("password").located(By.name("new_password"));

    /**
     * Target para el campo de confirmación de contraseña.
     */
    public static final Target C_NEW_PASSWORD = Target.the("confirm password").located(By.name("confirmed_password"));

    /**
     * Target para el botón de creación de cuenta.
     */
    public static final Target CREATE_ACCOUNT_BUTTON = Target.the("create account button").located(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[1]/div/div/div/div/div/div/form/button"));

    /**
     * Target para el título de captcha.
     */
    public static final Target CAPTCHA_TITTLE = Target.the("captcha tittle").located(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[1]/div/div/div/div/div/div/form/div[3]/h3"));

    /**
     * Target para el botón de cierre emergente (POP Bad).
     */
    public static final Target POP_BAD = Target.the("POP Bad")
            .locatedBy("//*[@id=\"b2indexPage\"]/div[17]/div/div/div/div[1]/div[1]/div/button");
}
