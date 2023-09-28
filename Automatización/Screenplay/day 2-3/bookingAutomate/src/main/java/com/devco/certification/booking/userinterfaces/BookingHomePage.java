package com.devco.certification.booking.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

/**
 * Esta clase representa la página de inicio de Booking.com.
 */
@DefaultUrl("https://www.booking.com")
public class BookingHomePage extends PageObject {

 /**
  * Target para el botón de inicio de sesión.
  */
 public static final Target LOGIN_BUTTON = Target.the("login button").located(By.xpath("//*[@id=\"b2indexPage\"]/header/nav[1]/div[2]/div[6]/a"));

 /**
  * Target para el botón de búsqueda.
  */
 public static final Target SEARCH_BUTTON = Target.the("search button").located(By.xpath("//*[@id=\"frm\"]/div[1]/div[4]/div[2]/button"));

 /**
  * Target para el botón de crear una cuenta.
  */
 public static final Target MAKE_ACCOUNT_BUTTON = Target.the("create account button").located(By.xpath("//*[@id=\"b2indexPage\"]/header/nav[1]/div[2]/div[5]/a"));

 /**
  * Target para el botón de búsqueda de taxis (cabs).
  */
 public static final Target CABS_BUTTON = Target.the("cabs button").located(By.xpath("//*[@id=\"b2indexPage\"]/header/nav[2]/ul/li[5]/a"));

 /**
  * Target para el botón de búsqueda de atracciones (attractions).
  */
 public static final Target ATTRACTIONS_BTN = Target.the("attractions button").located(org.openqa.selenium.By.xpath("//*[@id=\"b2indexPage\"]/header/nav[2]/ul/li[4]/a"));

 /**
  * Target para el botón de búsqueda de autos (cars).
  */
 public static final Target CARS_BTN = Target.the("cars button").located(org.openqa.selenium.By.xpath("//a[contains(@data-ga-track,'cars')]"));

 /**
  * Target para el botón de cierre emergente (POP Bad).
  */
 public static final Target POP_BAD = Target.the("POP Bad")
         .locatedBy("//*[@id=\"b2indexPage\"]/div[17]/div/div/div/div[1]/div[1]/div/button");
}
