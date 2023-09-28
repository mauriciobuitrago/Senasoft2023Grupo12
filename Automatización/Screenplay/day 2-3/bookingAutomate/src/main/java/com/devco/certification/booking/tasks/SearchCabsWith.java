package com.devco.certification.booking.tasks;


import com.devco.certification.booking.models.CabModel;
import com.devco.certification.booking.userinterfaces.CabSearchPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SearchCabsWith implements Task {

    private CabModel cabModel;

    public SearchCabsWith(CabModel cabModel) {
        this.cabModel = cabModel;
    }

    @Override
    @Step("{0} Enters cab preferences")
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Enter.theValue(cabModel.getOrigin()).into(CabSearchPage.ORIGIN_TXT),
                Click.on(CabSearchPage.ORIGIN_SLCTN),
                Enter.theValue(cabModel.getDropOff()).into(CabSearchPage.DROP_OFF_TXT),
                Click.on(CabSearchPage.DROP_OFF_SLCTN),
                Click.on(CabSearchPage.DATE_BTN),
                Click.on(CabSearchPage.DATE.of(cabModel.getDate())),
                Click.on(CabSearchPage.PICK_UP_TIME),
                SelectFromOptions.byVisibleText(cabModel.getPickUpHour()).from(CabSearchPage.PICK_UP_HOUR),
                SelectFromOptions.byVisibleText(cabModel.getPickUpMin()).from(CabSearchPage.PICK_UP_MIN),
                Click.on(CabSearchPage.CONFIRM_BTN),
                SelectFromOptions.byVisibleText(cabModel.getPassengers()).from(CabSearchPage.PASSENGERS),
                Click.on(CabSearchPage.SEARCH_BTN));

    }

    public static SearchCabsWith servicePreferences(CabModel cabModel){
        return instrumented(SearchCabsWith.class, cabModel);
    }

}
