package com.devco.certification.booking.userinterfaces;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchingCabsPage extends PageObject {

    public static final Target SEARCHING_SCREEN = Target.the("searching screen").located(By.xpath("/html/body/div[1]/div[2]/div/h1"));

    public static final Target POP_BAD = Target.the("POP Bad")
            .locatedBy("//*[@id=\"b2indexPage\"]/div[17]/div/div/div/div[1]/div[1]/div/button");
}
