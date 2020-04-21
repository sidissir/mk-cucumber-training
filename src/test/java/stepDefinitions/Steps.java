package stepDefinitions;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	
	@Before
	public void setUp() {
		System.out.println("==========================I am before hook=============================================");
		System.out.println("I get executed before each scenario");
		System.out.println("Connecting to databases");
		System.out.println("Reading values from properties files");
		System.out.println("Browser is opened");
	}
	
	@After
	public void cleanUp() {
		System.out.println("==========================I am After hook=============================================");
		System.out.println("I get executed after each scenario");
		System.out.println("Closing connections to databases");
		System.out.println("Browser is closed");

	}

	@Given("I have opened a browser")
	public void i_have_opened_a_browser() {
		System.out.println("---------------------------------------------------");
		System.out.println("I have opened chrome browser using selenium");
	}

	@Given("I navigate to home page")
	public void i_navigate_to_home_page() {
		System.out.println("---------------------------------------------------");

		System.out.println("In chrome browser,I have opened amazon.co.uk using selenium");
	}

	@When("I enter {string} in search box")
	public void i_enter_in_search_box(String category) {
		System.out.println("---------------------------------------------------");
		System.out.println("The category that is being search for is : " + category);
		System.out.println("Located search box using selenium");
		System.out.println("Enetered shoes in search box using selenium");
	}

	@When("I click search button")
	public void i_click_search_button() {
		System.out.println("---------------------------------------------------");

		System.out.println("Located search button using selenium");
		System.out.println("clicked search button using selenium");
	}

	@Then("All shoe products should be displayed")
	public void all_shoe_products_should_be_displayed() {
		System.out.println("---------------------------------------------------");

		System.out.println("Capturing Actual result using selenium");
		System.out.println("Comparing Actual result matches with expected result using testng");
		System.out.println(
				"Using TestNg, compared that all the displayed products have shoe keyword in their description");

	}

	@Given("I select {string} category")
	public void i_select_category(String string) {
		System.out.println("---------------------------------------------------");
		System.out.println("Selecting a category using selenium");
	}

	@When("I want size {int} shoes")
	public void i_want_size_shoes(Integer shoeSize) {
		System.out.println("---------------------------------------------------");
		System.out.println("The shoe size that i am looking for is : " + shoeSize);
	}

	@Given("I am on user registration page")
	public void i_am_on_user_registration_page() {
		System.out.println("---------------------------------------------------");
		System.out.println("I navigated to user caretion page using selenium");
	}

	@When("I enter {string} in user name field")
	public void i_enter_in_user_name_field(String uName) {
		System.out.println("---------------------------------------------------");
		System.out.println("Enetered Username : " + uName);
	}

	@When("I enter {string} in password field")
	public void i_enter_in_password_field(String pwd) {
		System.out.println("---------------------------------------------------");
		System.out.println("Enetered Password : " + pwd);
	}

	@When("I enter {string} in gender field")
	public void i_enter_in_gender_field(String gender) {
		System.out.println("---------------------------------------------------");
		System.out.println("Enetered Fender : " + gender);
	}

	@When("I enter {int} in age field")
	public void i_enter_in_age_field(Integer age) {
		System.out.println("---------------------------------------------------");
		System.out.println("Enetered Age : " + age);
	}

	@When("I click create account button")
	public void i_click_create_account_button() {
		System.out.println("---------------------------------------------------");
		System.out.println("Clicked on create account button using selenium : ");
	}

	@Then("Account creation should be successfull")
	public void account_creation_should_be_successfull() {
		System.out.println("---------------------------------------------------");
		System.out.println("Verified that account created : ");
	}

	@Given("I am on grocery site")
	public void i_am_on_grocery_site() {
		System.out.println("---------------------------------------------------");
		System.out.println("I have opened grocery site ");
	}

	@When("I add following items of given quantity")
	public void i_add_following_items_of_given_quantity(DataTable dataTable) {
		System.out.println("---------------------------------------------------");
		
		List<Map<String, String>> allDataMaps = dataTable.asMaps();

		for(Map<String,String>  eachDataMap : allDataMaps) {
			String itemName =  eachDataMap.get("grocery_item");

			String itemQuantity = eachDataMap.get("quantity");
			System.out.println("Added this item to basket : " + itemName);

			System.out.println("Quantity is : " + itemQuantity);
		}

	}

	@When("I checkout")
	public void i_checkout() {
		System.out.println("---------------------------------------------------");
		System.out.println("Checking out after adding items to the cart ");
	}

	@When("I complete payment")
	public void i_complete_payment() {
		System.out.println("---------------------------------------------------");
		System.out.println("Completed payment ");
	}

	@Then("Payment should be successfull")
	public void payment_should_be_successfull() {
		System.out.println("---------------------------------------------------");
		System.out.println("Verified that payment is successfull");
	}

}
