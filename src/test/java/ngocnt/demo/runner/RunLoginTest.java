package ngocnt.demo.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
        @CucumberOptions(
                plugin = {"pretty","html:target/report.html"},
                glue = "ngocnt.demo.steps",
                features = "src/test/java/ngocnt/demo/feature/Login.feature"
        )
public class RunLoginTest {
}
