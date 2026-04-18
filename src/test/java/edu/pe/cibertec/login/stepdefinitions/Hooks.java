package edu.pe.cibertec.login.stepdefinitions;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.Before;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class Hooks {
    @Managed
    AndroidDriver driver;

    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
    }




}
