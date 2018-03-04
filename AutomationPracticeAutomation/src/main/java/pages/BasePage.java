package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {
	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor js;
	Actions actions;
	
	@FindBy(xpath = "//h1[@class='page-heading']")
	WebElement pageHeading;
	
	@FindBy(xpath = "//div[@class='shopping_cart']//span[contains(@class,'ajax_cart_quantity') and not(@style='display: none;')]")
	WebElement cartItem;
	
	String topMenuItem = "//a[text()='<MENU_ITEM>' and not(./ancestor::ul[contains(@class,'submenu-container')])]";
	String subMenuItem = "//ul[contains(@class,'submenu-container') and @style='display: block;']//a[text()='<SUB_MENU_ITEM>']";
	
	public BasePage(WebDriver driver){
		this.driver = driver;
		actions = new Actions(driver);
		wait = new WebDriverWait(driver, 10);
		js = (JavascriptExecutor)driver;
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
	
	public int getNumberOfItemsInCart(){
		int cartCount = 0;
		try{
			String cartText = cartItem.getText();
			cartCount = Integer.parseInt(cartText);
		}catch(Exception e){
			
		}
		return cartCount;
	}
	
	public void mouseHoverToMenu(String menuItem){
		String menuItemXpath = topMenuItem.replace("<MENU_ITEM>", menuItem);
		WebElement menuElement = driver.findElement(By.xpath(menuItemXpath));
		actions.moveToElement(menuElement).perform();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void openSubMenuItem(String subMenuItemTxt){
		String subMenuItemXpath = subMenuItem.replace("<SUB_MENU_ITEM>", subMenuItemTxt);
		WebElement subMenuElement = driver.findElement(By.xpath(subMenuItemXpath));
		subMenuElement.click();
	}
}
