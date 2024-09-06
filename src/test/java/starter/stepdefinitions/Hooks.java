package starter.stepdefinitions;

import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;

import io.appium.java_client.AppiumDriver;
import io.cucumber.java.After;

import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setStage() {
        OnStage.setTheStage(new Cast());
    }
    @After
    public void tearDown(){
        AppiumDriver driver = OnStage.theActorInTheSpotlight().recall("driver");
        driver.quit();
    }
}
