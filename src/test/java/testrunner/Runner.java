package testrunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "M:\\com.bankproject\\src\\feature",
        glue = {"stepdefinations"},
         plugin = {"pretty","json:Report"}, // to create report file in json format

        // We can use this reporting later//
        //plugin= {"html:target/default-cucumber-reports",
        //                "json:target/json-reports/cucumber.json",
        //                "junit:target/xml-report/cucumber.xml"},
        monochrome = true,
        dryRun = false
)

public class Runner {

}
