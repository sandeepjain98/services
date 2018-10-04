/**
 * Created by thilinaga on 7/3/2017.
 */
package StepDefinations;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        format = {"pretty", "html:target/Destination"} )
public class TestRunner {
}