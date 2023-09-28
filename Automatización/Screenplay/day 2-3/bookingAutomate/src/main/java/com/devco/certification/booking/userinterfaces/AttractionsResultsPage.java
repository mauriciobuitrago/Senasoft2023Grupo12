package com.devco.certification.booking.userinterfaces;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AttractionsResultsPage extends PageObject {

    public static Target CATEGORY = Target.the("category").locatedBy("//*[text()='{0}']");
    public static final Target OPTION = Target.the("option").located(By.xpath("//*[@class='css-xbcz3d'][1]"));

    public static final Target POP_BAD = Target.the("POP Bad")
            .locatedBy("//*[@id=\"b2indexPage\"]/div[17]/div/div/div/div[1]/div[1]/div/button");
}
