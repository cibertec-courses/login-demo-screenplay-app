package edu.pe.cibertec.login.runners;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("features")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "edu.pe.cibertec.login.stepdefinitions")
@ConfigurationParameter(
        key = "cucumber.plugin",
        value = "pretty, net.serenitybdd.cucumber.SerenityReporter"
)
public class LoginTestSuite {
}