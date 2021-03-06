package stepdef;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import base.BaseTest;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.AccountCreationPage;
import pages.HomePage;
import pages.LandingPage;
import pages.LoginPage;
import util.Configuration;

public class StepDefinations {

	WebDriver driver;
	LandingPage landingPage;
	LoginPage loginPage;
	HomePage homePage;
	AccountCreationPage accountCreationPage;
	
	int initialCartCount;
	
	@Before
	public void initiate(){
		Configuration.loadConfiguration();
		String browserName = Configuration.getBrowser();
		BaseTest baseTest = new BaseTest();
		driver = baseTest.getDriver(browserName);
	}
	
	@After()
	public void cleanup(){
		//driver.quit();
	}
	
	@Given("^user open automation practice website$")
	public void user_open_automation_practice_website() throws Throwable {
		driver.get(Configuration.getURL());
		landingPage = new LandingPage(driver);
	}

	@When("^user navigates to login page$")
	public void user_navigates_to_login_page() throws Throwable {
		loginPage = landingPage.clickOnSignIn();
		Assert.assertTrue(loginPage.isPageLoaded());
	}

	@When("^enter username as \"([^\"]*)\" and password as \"([^\"]*)\" and click on login$")
	public void enter_username_as_and_password_as_and_click_on_login(String userName, String password) throws Throwable {
		homePage = loginPage.login(userName, password);
	}

	@Then("^user should be able to login$")
	public void user_should_be_able_to_login() throws Throwable {
		Assert.assertTrue(homePage.isPageLoaded());
	}

	@Then("^user should not be able to login$")
	public void user_should_not_be_able_to_login() throws Throwable {
		Assert.assertFalse(homePage.isPageLoaded());
	}
	
	@Then("^user login status should \"([^\"]*)\"$")
	public void user_login_status_should(String status) throws Throwable {
	   if(!((status.equalsIgnoreCase("Pass") && homePage.isPageLoaded()) || (status.equalsIgnoreCase("Fail") && !homePage.isPageLoaded()))){
		   Assert.fail();
	   }
	}
	
	@When("^user enters an email address as \"([^\"]*)\" and clicks on create account button$")
	public void user_enters_an_email_address_as_and_clicks_on_create_account_button(String arg1) throws Throwable {
		accountCreationPage = loginPage.accountCreate(arg1);
	}


	@Then("^user is navigated to registration page$")
	public void user_is_navigated_to_registration_page() throws Throwable {
		Assert.assertTrue(accountCreationPage.isPageLoaded());
	}
	
	@When("^user enters title as \"([^\"]*)\"$")
	public void user_enters_title_as(String arg1) throws Throwable {
		accountCreationPage.selectTitle(arg1);
	}

	@When("^user enters first name as \"([^\"]*)\"$")
	public void user_enters_first_name_as(String fname) throws Throwable {
	   accountCreationPage.enterFirstName(fname);
	}

	@When("^user enters last name as \"([^\"]*)\"$")
	public void user_enters_last_name_as(String lname) throws Throwable {
		accountCreationPage.enterLastName(lname);
	}

	@When("^user enters mobile phone as \"([^\"]*)\"$")
	public void user_enters_mobile_phone(String mobileNo) throws Throwable {
	   accountCreationPage.enterMobile(mobileNo);
	}
		
	@Given("^user finds out the no of items added to cart$")
	public void user_finds_out_the_no_of_items_added_to_cart() throws Throwable {
		initialCartCount = landingPage.getNumberOfItemsInCart();
	}

	@When("^user mouse hovers to \"([^\"]*)\" menu$")
	public void user_mouse_hovers_to_menu(String menuItem) throws Throwable {
	    landingPage.mouseHoverToMenu(menuItem);
	}

	@When("^user clicks on \"([^\"]*)\"$")
	public void user_clicks_on(String subMenuItem) throws Throwable {
		landingPage.openSubMenuItem(subMenuItem);
	}

	@Then("^user should be navigated to Evening Dresses page$")
	public void user_should_be_navigated_to_Evening_Dresses_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^user adds the first item to cart$")
	public void user_adds_the_first_item_to_cart() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^user should get a message as \"([^\"]*)\"$")
	public void user_should_get_a_message_as(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^user closes the modal box$")
	public void user_closes_the_modal_box() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^an item should be added to cart$")
	public void an_item_should_be_added_to_cart() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	
}
