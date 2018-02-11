package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AccountCreationPage extends BasePage{
	public static final String PAGE_HEADER = "CREATE AN ACCOUNT";
	public AccountCreationPage(WebDriver driver) {
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

}
