package starter.runners;

import io.cucumber.junit.CucumberOptions;
import starter.utils.BeforeSuite;
import starter.utils.DataToFeature;

import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import java.io.IOException;

@RunWith(RunnerPersonalizado.class)
@CucumberOptions(features = "src/test/resources/features",
        glue = "starter.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class TestCalculatorRunner {
    @BeforeSuite
    public static void test() throws InvalidFormatException, IOException
    {
        DataToFeature.overrideFeatureFiles("src/test/resources/features/calculator.feature");
    }

    @BeforeClass
    public static void setStage() {
        OnStage.setTheStage(new Cast());
    }
}