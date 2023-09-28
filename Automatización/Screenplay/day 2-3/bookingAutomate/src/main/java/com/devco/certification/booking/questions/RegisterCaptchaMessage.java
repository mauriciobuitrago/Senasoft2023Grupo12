package com.devco.certification.booking.questions;


import com.devco.certification.booking.userinterfaces.LoginPage;
import com.devco.certification.booking.userinterfaces.RegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class RegisterCaptchaMessage implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return the(RegisterPage.CAPTCHA_TITTLE).answeredBy(actor).isCurrentlyVisible();

    }

    public static Question<Boolean> isDisplayed() {
        return new RegisterCaptchaMessage();
    }

}
