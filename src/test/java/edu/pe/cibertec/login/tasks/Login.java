package edu.pe.cibertec.login.tasks;

import edu.pe.cibertec.login.ui.LoginScreen;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Performable {
    private final String usuario;
    private final String password;

    public Login(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
    }

    public static Performable conCredenciales(String usuario, String password) {
        return Task.where("{0} se loguea con " + usuario + " / " + password,
                new Login(usuario, password));
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(usuario).into(LoginScreen.CAMPO_USUARIO),
                Enter.theValue(password).into(LoginScreen.CAMPO_PASSWORD),
                Click.on(LoginScreen.BOTON_INGRESAR)
        );

    }
}
