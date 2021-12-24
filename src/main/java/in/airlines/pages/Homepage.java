package in.airlines.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Homepage {
	Actions actions;
	


	@FindBy(xpath ="//select[contains(@name,'source')]")
	private WebElement source;
	
	@FindBy(xpath ="//select[contains(@name,'destination')]")
	private WebElement destination;
	
	@FindBy(css ="button:nth-child(1)")
	private WebElement submit;
	
	@FindBy(css ="body > a:nth-child(2)")
	private WebElement homebutt;
	
	@FindBy(css ="body > form:nth-child(6) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(3) > td:nth-child(1) > button:nth-child(1)")
	private WebElement login;
	
	@FindBy(css ="body > table:nth-child(11) > tbody:nth-child(1) > tr:nth-child(2) > td:nth-child(6) > a:nth-child(1)")
	private WebElement bookflight;
	
	@FindBy(css ="body > a:nth-child(28)")
	private WebElement cbook;
	
	@FindBy(css ="body > a:nth-child(13)")
	private WebElement seebookings;
	
	
	public Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		actions = new Actions(driver);
	
	}
	
	public void login() {
		login.click();
	}
	public void bnglr(){
		source.click();
		actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	}
	
	public void chennai(){
		destination.click();
		actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	}
	public void submit_but() {
		submit.click();
		
	}
	public void  click_home() {
		homebutt.click();
	}
	
	public void book_fli() {
		bookflight.click();
		
	} 
	public void Confirm_book () {
		cbook.click();
	}
	public void see_book() {
		seebookings.click();
	}
}
