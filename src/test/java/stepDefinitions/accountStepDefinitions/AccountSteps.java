package stepDefinitions.accountStepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AccountSteps {

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

	
	@Given("I am on home page")
	public void i_am_on_home_page() {
		System.out.println("---------------------------------------------------");
		System.out.println("I navigated to home page using selenium");
	}

	@When("click on login link")
	public void click_on_login_link() {
		System.out.println("---------------------------------------------------");
		System.out.println("I clicked login link using selenium");
	}

	@When("I enter valid username in username field")
	public void i_enter_valid_username_in_username_field() {
		System.out.println("---------------------------------------------------");
		System.out.println("Username using selenium");
	}

	@When("I enter valid password in password field")
	public void i_enter_valid_password_in_password_field() {
		System.out.println("---------------------------------------------------");
		System.out.println("Password using selenium");
	}

	@When("I click login button")
	public void i_click_login_button() {
		System.out.println("---------------------------------------------------");
		System.out.println("clicked login buton using selenium");
	}

	@Then("I should be taken to my home page")
	public void i_should_be_taken_to_my_home_page() {
		System.out.println("---------------------------------------------------");
		System.out.println("Verified that i am on home page using selenium");
	}

	@Then("I should see a logout link")
	public void i_should_see_a_logout_link() {
		System.out.println("---------------------------------------------------");
		System.out.println("Verified that there is logout using selenium");
	}

	@Then("I should see My Account link")
	public void i_should_see_My_Account_link() {
		System.out.println("---------------------------------------------------");
		System.out.println("Verified there is My acount using selenium");
	}

	@Then("I should not see Login link")
	public void i_should_not_see_Login_link() {
		System.out.println("---------------------------------------------------");
		System.out.println("Verified that thre is no login link using selenium");
	}

}
