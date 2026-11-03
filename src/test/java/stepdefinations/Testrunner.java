package stepdefinations;


import io.cucumber.junit.platform.engine.Cucumber;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
        features ="C:\\Users\\priya\\IdeaProjects\\Wdmaven\\src\\test\\resources\\login.feature",
        glue = {"stepdefinations"},
        plugin={"pretty","html:login/login.html"}
)
// Checks if all steps have definitions

public class Testrunner {


}
