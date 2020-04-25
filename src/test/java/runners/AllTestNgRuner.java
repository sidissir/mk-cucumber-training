package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
					features = {"src/test/resources/features/"},
					glue = {"stepDefinitions","hooks"},
					//tags = {"@SearchBoxSearch"},
					plugin = {"html:target/CucReports/" ,"json:target/CucReports/CucJson.json"},
					monochrome = true
				)
public class AllTestNgRuner extends AbstractTestNGCucumberTests{

}
