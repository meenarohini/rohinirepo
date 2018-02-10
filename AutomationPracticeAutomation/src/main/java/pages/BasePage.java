package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasePage {
	WebDriver driver;
	public BasePage(WebDriver driver){
		this.driver = driver;
	}
	
	@FindBy(className = "login")
	WebElement loginBtn;
	
	@FindBy(id = "search_query_top")
	WebElement searchBox;
	
	public void clickOnSignIn(){
		loginBtn.click();
	}
}
