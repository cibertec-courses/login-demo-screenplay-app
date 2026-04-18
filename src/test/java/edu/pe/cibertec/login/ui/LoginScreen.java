package edu.pe.cibertec.login.ui;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginScreen {
    public static  final Target CAMPO_USUARIO = Target
            .the("campo usuario")
            .located(By.xpath("//android.widget.TextView[@text=\"Usuario\"]"));

    public static final Target CAMPO_PASSWORD = Target
            .the("campo password")
            .located(By.xpath("//android.widget.TextView[@text=\"Password\"]"));

    public static final Target BOTON_INGRESAR = Target
            .the("boton ingrsar")
            .located(By.xpath("//android.widget.TextView[@text=\"Ingresar\"]"));

}
