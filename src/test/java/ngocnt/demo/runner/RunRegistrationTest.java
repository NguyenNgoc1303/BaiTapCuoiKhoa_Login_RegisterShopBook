package ngocnt.demo.runner;

import io.cucumber.java.en.And;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
        @CucumberOptions(
                plugin = {"pretty","html:target/reportRegistration.html"},
                glue = "ngocnt.demo.steps",
                features = "src/test/java/ngocnt/demo/feature/Registration.feature"
        )
public class RunRegistrationTest {

}
