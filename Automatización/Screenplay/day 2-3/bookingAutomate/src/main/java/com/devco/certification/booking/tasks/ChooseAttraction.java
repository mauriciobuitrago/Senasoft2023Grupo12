package com.devco.certification.booking.tasks;


import com.devco.certification.booking.models.AttractionsModel;
import com.devco.certification.booking.userinterfaces.AttractionsResultsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ChooseAttraction implements Task {

    private AttractionsModel attractionsModel;

    public ChooseAttraction(AttractionsModel attractionsModel) {
        this.attractionsModel = attractionsModel;
    }

    @Override
    @Step("{0} Chooses an attraction")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(AttractionsResultsPage.CATEGORY.of(attractionsModel.getCategory())));
    }

    public static ChooseAttraction category(AttractionsModel attractionsModel){
        return instrumented(ChooseAttraction.class, attractionsModel);
    }
}
