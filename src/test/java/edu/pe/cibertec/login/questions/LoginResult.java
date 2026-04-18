package edu.pe.cibertec.login.questions;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.findby.By;

public class LoginResult {
    private static final Target MENSAJE_BIENVENIDA = Target
            .the("mensaje de bienvenida")
            .located(By.xpath("//android.widget.TextView[@text=\"Bievenido admin\"]"));

    public static Question<Boolean> estaVisible(){
        return  actor -> Visibility.of(MENSAJE_BIENVENIDA).answeredBy(actor);
    }
}

