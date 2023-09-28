package com.devco.certification.booking.userinterfaces;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SelectedAttractionPage extends PageObject {

    public static final Target ACTIVITY_NAME = Target.the("activity name").located(By.xpath("//h2[contains(@class,'css-1uk1gs8')]"));

    public static final Target POP_BAD = Target.the("POP Bad")
            .locatedBy("//*[@id=\"b2indexPage\"]/div[17]/div/div/div/div[1]/div[1]/div/button");
}
