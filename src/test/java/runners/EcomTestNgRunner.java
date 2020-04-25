package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/resources/features/ecomfeatures/"},glue = {"stepDefinitions/ecomStepDefinitions"})
public class EcomTestNgRunner extends AbstractTestNGCucumberTests{

}
