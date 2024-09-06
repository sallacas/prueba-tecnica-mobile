package starter.ui;

import org.openqa.selenium.By;

public class CalculatorView {
    public static By buttonTarget(String number){
        return By.xpath("//android.widget.ImageButton[@content-desc='"+number+"']");
    }
    public static By RESULT_TARGET = By.id("com.google.android.calculator:id/result_final");
    public static By BTN_EQUALS = By.id("com.google.android.calculator:id/eq");
}
