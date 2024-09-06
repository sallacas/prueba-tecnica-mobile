package starter.question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import io.appium.java_client.AppiumDriver;
import starter.ui.CalculatorView;

public class Result implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        AppiumDriver driver = actor.recall("driver");
        return driver.findElement(CalculatorView.RESULT_TARGET).getText();
    }
    public static Result is(){
        return new Result();
    }
}
