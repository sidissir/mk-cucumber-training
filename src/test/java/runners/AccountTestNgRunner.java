package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//features => Location of feature files
//glue => Package name which contains step definitions
@CucumberOptions(features = {"src/test/resources/features/accountfeatures/"},glue = {"stepDefinitions/accountStepDefinitions"})
public class AccountTestNgRunner extends AbstractTestNGCucumberTests {

}
