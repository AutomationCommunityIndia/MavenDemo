package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.Login;

public class FirstWebTest {
	Login login = new Login();
	
	@Given("^Launch the saucedemo application$")
	public void launch_the_saucedemo_application() {
		login.LaunchURL();
	}

	@When("Enter the username")
	public void enter_the_username() {
	
	}

	@When("Enter the password")
	public void enter_the_password() {
	
	}

	@Then("validate the cart name")
	public void validate_the_cart_name() {
	
	}

}
