package in.airlines.testscripts;


import org.openqa.selenium.chrome.ChromeDriver;

import in.airlines.pages.Homepage;
import in.airlines.pages.SignInclass;
import in.airlines.pages.Signup;


public class Driver extends Tools {
	
	protected static Homepage homepage;
	protected static SignInclass signin;
	protected static Signup signup;
	
	public static  void init( ) {
		System.setProperty("webdriver.chrome.driver","resources//chromedriver.exe");
		driver = new ChromeDriver();
		homepage = new Homepage(driver);
		signin = new SignInclass(driver);
		signup= new Signup(driver);
		
		
		

	}
}


