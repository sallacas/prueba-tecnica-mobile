package starter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class OpenCalculator implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        DesiredCapabilities caps = new DesiredCapabilities();
        try {
            caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
            caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
            caps.setCapability(MobileCapabilityType.DEVICE_NAME, "TestDevice");
            caps.setCapability(MobileCapabilityType.APP, "C:\\AutoProject\\prueba-tecnica-mobile\\src\\test\\resources\\calculator.apk");
            caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");

            AppiumDriver driver;
            driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), caps);
            actor.remember("driver", driver);  // Guarda el driver en la memoria del actor
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public static Task inDevice() {
        return Tasks.instrumented(OpenCalculator.class);
    }
}
