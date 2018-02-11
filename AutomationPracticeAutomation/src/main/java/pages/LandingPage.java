package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LandingPage  extends BasePage{
	public static final String PAGE_TITLE = "My Store";
	public LandingPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	@Override
	public boolean isPageLoaded() {
		if(driver.getTitle().equalsIgnoreCase(PAGE_TITLE)){
			return true;
		}else{
			return false;
		}
	}

}
