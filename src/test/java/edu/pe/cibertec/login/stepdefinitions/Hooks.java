package edu.pe.cibertec.login.stepdefinitions;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.cucumber.java.Before;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.time.Duration;

public class Hooks {
    @Managed
    AndroidDriver driver;

    @Before
    public void prepareStage() {
        UiAutomator2Options options = new UiAutomator2Options()
                .setPlatformName("Android")
                .setAutomationName("UiAutomator2")
                .setDeviceName("emulator-5554")
                .setAppPackage("edu.pe.cibertec.loginappdemo")
                .setAppActivity("edu.pe.cibertec.loginappdemo.MainActivity")
                .setNoReset(false)
                .setNewCommandTimeout(Duration.ofSeconds(120));

        OnStage.setTheStage(new OnlineCast());
    }




}
