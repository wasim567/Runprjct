package chromeOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/feature", glue="stepDefenation",dryRun=false, monochrome=true,
plugin={"pretty","html:target/cuucmber/index.html","json:target/cuucmber/cucumber.json","junit:target/cuucmber/cukes.xml"})
public class TestRunner {

}
