package in.airlines.testscripts;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Bookingsteps  extends Driver{

	@Given("the user click on the login button")
	public void the_user_click_on_the_login_button() {
	    signup.click_sign();
	}

	@Given("he clicks on the not a member")
	public void he_clicks_on_the_not_a_member() {
	   signup.member_up();
	}

	@Given("he entered the valid details")
	public void he_entered_the_valid_details() {
	    signup.enter_eid();
	}

	@Then("the user registered succesfully")
	public void the_user_registered_succesfully() {
	   signup.sign_up();
	   System.out.println("user registered succesfully");
	}
}
