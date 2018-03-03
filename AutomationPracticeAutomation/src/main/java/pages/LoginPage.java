package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage  extends BasePage{
	public static final String PAGE_HEADER = "AUTHENTICATION";
	
	public LoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	@Override
	public boolean isPageLoaded() {
		if(pageHeading.getText().equalsIgnoreCase(PAGE_HEADER)){
			return true;
		}else{
			return false;
		}
	}
	
	@FindBy(id = "email")
	WebElement emailTxtBox;
	
	@FindBy(name = "passwd") WebElement passwordTxtBox;
	
	@FindBy(id = "SubmitLogin")
	WebElement submitBtn;
	
	@FindBy(id = "email_create")
	WebElement emailCreateTxtBox;
	
	@FindBy(id = "SubmitCreate")
	WebElement accountCreateBtn;
	
	
	public HomePage login(String userName, String password){
		emailTxtBox.sendKeys(userName);
		passwordTxtBox.sendKeys(password);
		submitBtn.click();
		return new HomePage(driver);
	}
	
	public AccountCreationPage accountCreate(String email){
		emailCreateTxtBox.sendKeys(email);
		accountCreateBtn.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return new AccountCreationPage(driver);
	}

}
