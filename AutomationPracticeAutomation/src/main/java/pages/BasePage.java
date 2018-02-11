package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
	WebDriver driver;
	
	@FindBy(xpath = "//h1[@class='page-heading']")
	WebElement pageHeading;
	
	public BasePage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public abstract boolean isPageLoaded();
	
	@FindBy(className = "login")
	WebElement loginBtn;
	
	@FindBy(id = "search_query_top")
	WebElement searchBox;
	
	public LoginPage clickOnSignIn(){
		loginBtn.click();
		return new LoginPage(driver);
	}
}
