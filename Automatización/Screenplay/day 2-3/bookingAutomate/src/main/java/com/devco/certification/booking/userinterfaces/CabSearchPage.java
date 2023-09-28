package com.devco.certification.booking.userinterfaces;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CabSearchPage extends PageObject {

    public static final Target ORIGIN_TXT = Target.the("pickup text box").located(By.id("pickupLocation"));
    public static final Target ORIGIN_SLCTN = Target.the("pickup location").located(By.xpath("//*[@id=\"pickupLocation-items\"]/li[2]/button/div/h4"));
    public static final Target DROP_OFF_TXT = Target.the("drop off text box").located(By.id("dropoffLocation"));
    public static final Target DROP_OFF_SLCTN = Target.the("drop off location").located(By.xpath("//*[@id=\"dropoffLocation-items\"]/li[2]/button/div/h4"));
    public static final Target DATE_BTN = Target.the("calendar").located(By.xpath("//*[@id=\"booking-taxi-searchbar__container\"]/div/div/div/form/div[2]/div[1]/div[2]/div/div/div[1]/div/button"));
    public static Target DATE = Target.the("date").locatedBy("//*[@aria-label = '{0}']");;
    public static final Target PICK_UP_TIME = Target.the("pick up time").located(By.xpath("//*[@id=\"booking-taxi-searchbar__container\"]/div/div/div/form/div[2]/div[1]/div[2]/div/div/div[2]/div/div[1]/div/button"));
    public static final Target PICK_UP_HOUR = Target.the("pick up hour").located(By.id("pickupHour"));
    public static final Target PICK_UP_MIN = Target.the("pick up min").located(By.id("pickupMinute"));
    public static final Target CONFIRM_BTN = Target.the("confirm button").located(By.xpath("//*[@id=\"booking-taxi-searchbar__container\"]/div/div/div/form/div[2]/div[1]/div[2]/div/div/div[2]/div/div[1]/div/div/div/div/div/div/div/button"));
    public static final Target PASSENGERS = Target.the("passengers").located(By.id("passengers"));
    public static final Target SEARCH_BTN = Target.the("search button").located(By.name("searchButton"));

    public static final Target POP_BAD = Target.the("POP Bad")
            .locatedBy("//*[@id=\"b2indexPage\"]/div[17]/div/div/div/div[1]/div[1]/div/button");
}
