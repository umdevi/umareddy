package in.airlines.testscripts;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class CloudAirlineSteps extends Driver {
	
	@Given("the user clicks on the login page")
	public void the_user_clicks_on_the_login_page() {
		signin.login();
	}

	@Given("he enters the details")
	public void he_enters_the_details() {
		signin.details();
	}
	@Given("he clicks on the login button")
	public void he_clicks_on_the_login_button() {
		homepage.login();
	    
	}
	@Then("he clicks on the home button")
	public void he_clicks_on_the_home_button() {
	    homepage.click_home();
	}

	
	@Given("the user select the source location")
	public void the_user_select_the_source_location() {
	  homepage.bnglr();
	}
	@Given("he selects destination")
	public void he_selects_destination() {
		homepage.chennai();
	}
	@Given("he clicks on the submit button")
	public void he_clicks_on_the_submit_button() {
		homepage.submit_but();
	}

	@Then("he clicks on the book Flight")
	public void he_clicks_on_the_book_flight() {
		homepage.book_fli();
	}

	@Then("he clicks on the confirm bookings")
	public void he_clicks_on_the_confirm_bookings() {
		homepage.Confirm_book();
	}

	@Then("he see his bookings")
	public void he_see_his_bookings() {
    homepage.see_book();
	}
	@Then("the user login searching and booking verified succesfully")
	public void the_user_login_searching_and_booking_verified_succesfully() {
		System.out.println("user search login and verification successfull");
	}
	}
