package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class AllHooks2 {

	@Before("@ecom")
	public void setUp2() {
		System.out.println("==========================I am before hook 2=============================================");
		System.out.println("I get executed before each scenario");
		System.out.println("Connecting to databases");
		System.out.println("Reading values from properties files");
		System.out.println("Browser is opened");
	}

	@After("@ecom")
	public void cleanUp2() {
		System.out.println("==========================I am After hook 2=============================================");
		System.out.println("I get executed after each scenario");
		System.out.println("Closing connections to databases");
		System.out.println("Browser is closed");
	}

}
