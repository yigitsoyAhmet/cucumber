package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-reports2.html",
                "json:target/json-reports/cucumber2.json",
                "junit:target/xml-report/cucumber2.xml"},

        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@ss", //"@smoke or @regression" : ayrı ayrı calıstırır ikisini de
        // "@smoke and @regression" : ise sadece ikisi isaretlenmis olanları calıstırır.
        dryRun = false
)

public class ParalelRunner2 {

}
