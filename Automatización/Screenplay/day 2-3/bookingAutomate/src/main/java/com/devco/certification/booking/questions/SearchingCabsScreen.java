package com.devco.certification.booking.questions;


import com.devco.certification.booking.userinterfaces.SearchingCabsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class SearchingCabsScreen implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return the(SearchingCabsPage.SEARCHING_SCREEN).answeredBy(actor).isCurrentlyVisible();
    }

    public static Question<Boolean> isDisplayed(){
        return new SearchingCabsScreen();
    }
}
