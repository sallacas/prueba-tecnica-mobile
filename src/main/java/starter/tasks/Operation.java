package starter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.annotations.Subject;


import io.appium.java_client.AppiumDriver;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import starter.ui.CalculatorView;

@Slf4j
@AllArgsConstructor
public class Operation implements Task {
    private final String firstNumber;
    private final String secondNumber;
    private final String operation;

    private String obtenerOperacion(String operation) {
        switch (operation.toUpperCase()) {
            case "SUMAR":
                return "plus";
            case "RESTAR":
                return "minus";
            case "MULTIPLICAR":
                return "multiply";
            case "DIVIDIR":
                return "divide";
            default:
                return operation;
        }
    }

    @Override
    @Subject("{}: Click on the first number #firstNumber and then on #operation and then on the second number #secondNumber")
    public <T extends Actor> void performAs(T actor) {
        AppiumDriver driver = actor.recall("driver");
        for (char c : firstNumber.toCharArray()) {
            driver.findElement(CalculatorView.buttonTarget(String.valueOf(c))).click();
        }
        driver.findElement(CalculatorView.buttonTarget(obtenerOperacion(operation))).click();
        for (char c : secondNumber.toCharArray()) {
            driver.findElement(CalculatorView.buttonTarget(String.valueOf(c))).click();
        }
        driver.findElement(CalculatorView.BTN_EQUALS).click();
    }

    public static Operation with(String firstNumber, String secondNumber, String operation) {
        return Tasks.instrumented(Operation.class, firstNumber, secondNumber, operation);
    }
}
