package in.airlines.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signup {
	Actions actions;

	@FindBy(css = "body > a:nth-child(3)")
	private WebElement signinlink;
	
	@FindBy(css = "body > form:nth-child(6) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(3) > td:nth-child(1) > a:nth-child(3)")
	private WebElement member;
	
	@FindBy(name = "email_id")
	private WebElement eid;
	
	@FindBy(name = "pwd")
	private WebElement mpass;
	
	@FindBy(name = "pwd2")
	private WebElement mpass2;
	
	@FindBy(name = "name")
	private WebElement name;
	
	@FindBy(css ="body > form:nth-child(6) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(7) > td:nth-child(1) > button:nth-child(1)")
	private WebElement signup;
	
	public Signup(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		actions = new Actions(driver);
	
	}
	public void click_sign() {
		signinlink.click();
	}
	public void enter_eid( ) {
		eid.sendKeys("user@user.com");
		mpass.sendKeys("user");
		mpass2.sendKeys("user");
		name.sendKeys("user1");
		
	}
	public void member_up () {
		member.click();
	}
	public void sign_up() {
		signup.click();
	}
}
