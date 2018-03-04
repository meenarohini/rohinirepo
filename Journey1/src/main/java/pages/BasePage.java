package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import helper.ElementActions;

public class BasePage extends ElementActions{
	public BasePage(WebDriver driver){
	super(driver);	
	}
private String flightButton_xpath = "//span[contains(text(),'FLIGHTS')]";

public void openFlightButton(){
	
	//mouseHover(By.xpath("flightButton_xpath"));

 clickOn(By.xpath(flightButton_xpath));
}


}
