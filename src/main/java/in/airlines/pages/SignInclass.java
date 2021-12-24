package in.airlines.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInclass {
	Actions actions;
	
	@FindBy(name = "email_id")
	private WebElement email;
	
	@FindBy(name = "pwd")
	private WebElement password;
	
	@FindBy(css = "button:nth-child(1)")
	private WebElement login;
	
	@FindBy(css = "body > a:nth-child(3)")
	private WebElement signinlink;
	
	
	

	public SignInclass(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		actions = new Actions(driver);
		
	}
	public void login() {
		signinlink.click();
	}
	public  void details() {
		email.sendKeys("user@user.com");
		password.sendKeys("user");
		
	}
			
	}