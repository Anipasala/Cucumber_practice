package TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C://Cucumber//nop_commerce//src//test//Features//Login.feature",
        glue= "StepDefinition",
        plugin = {"pretty"}
        )

public class Runner {

}
