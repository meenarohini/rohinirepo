package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
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
	
	@FindBy(id="id_gender1")
	WebElement mister;
	
	@FindBy(id="id_gender2")
	WebElement mistress;
	
	@FindBy(name="customer_firstname")
	WebElement customerFirstName;
	
	@FindBy(name="customer_lastname")
	WebElement customerLastName;
	
	@FindBy(id="passwd")
	WebElement password;
	
	@FindBy(xpath="//select[@id='days']")
	WebElement daysDdown;
	
	@FindBy(xpath="//select[@id='months']")
	WebElement monthDdown;
	
	@FindBy(xpath="//select[@id='years']")
	WebElement yearDdown;
	
	@FindBy(id="company")
	WebElement company;
	
	@FindBy(id="address1")
	WebElement address;
	
	@FindBy(id="city")
	WebElement city;
	
	@FindBy(id="id_state")
	WebElement state;
	
	@FindBy(id="postcode")
	WebElement postcode;
	
	@FindBy(id="id_country")
	WebElement country;
	
	@FindBy(xpath="//textarea[@id='other']")
	WebElement additionInfo;
	
	@FindBy(id="phone_mobile")
	WebElement mobilePhone;
	
	@FindBy(id="submitAccount")
	WebElement registerButton;
	
	public void selectTitle(String titleName){
		if("mr".equalsIgnoreCase(titleName)){
			mister.click();
		}else{
			mistress.click();
		}
	}
	
	public void enterFirstName(String firstName){
		customerFirstName.sendKeys(firstName);
	}
	
	public void enterLastName(String lastName){
		customerLastName.sendKeys(lastName);
	}
	
	public void enterMobile(String mobileNo){
		mobilePhone.sendKeys(mobileNo);
	}

}
