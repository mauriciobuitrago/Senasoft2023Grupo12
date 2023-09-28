package com.devco.certification.booking.userinterfaces;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AttractionsSearchPage extends PageObject {

    public static final Target ATTRACTION_TXT = Target.the("search text box").located(By.name("query"));
    public static final Target SEARCH_BTN = Target.the("search button").located(By.xpath("//*[text()='Buscar']"));

    public static final Target POP_BAD = Target.the("POP Bad")
            .locatedBy("//*[@id=\"b2indexPage\"]/div[17]/div/div/div/div[1]/div[1]/div/button");
}