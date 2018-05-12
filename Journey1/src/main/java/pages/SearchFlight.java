package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchFlight extends BasePage{
	public SearchFlight(WebDriver driver){
		super(driver);
		
	}
	
	private String multicitySourceCity1_xpath ="//input[@id='BE_flight_origin_city_1']";
	//private By variable = By.xpath("ginjofignoijfsogjnsofjg");
	private String multicitySourceCity2_xpath="//input[@id='BE_flight_origin_city_2']";
	private String multicityDestinationCity1_xpath="//input[@id='BE_flight_arrival_city_1']";
	private String multicityDestinationCity2_xpath="//input[@id='BE_flight_arrival_city_2']";	
	private String multicityDepartDate1_xpath="//input[@id='BE_flight_depart_date_1']";
	private String multicityDepartDate2_xpath="//input[@id='BE_flight_depart_date_2']";
	
	private String roundTripSource_xpath="//input[@id='BE_flight_origin_city']";
	private String roundTripDestination_xpath="//input[@id='BE_flight_arrival_city']";
	private String roundTripdepartDateClick_xpath="//input[@id='BE_flight_depart_date']";	
	private String roundTripreturnDateClick_xpath="//input[@id='BE_flight_return_date']";
	
	
	private String travelDropdown_xpath="//div[@id='BE_flight_paxInfoBox']";
	private String adultSpinner_xpath="//div[@id='msdrpdd20_msdd']//span[@class='ddSpinnerPlus']";
			
	private String childSpinner_xpath="//div[@id='msdrpdd21_msdd']//span[@class='ddSpinnerPlus']";
	private String infantSpinner_xpath="//div[@id='msdrpdd22_msdd']//span[@class='ddSpinnerPlus']";
	
	private String searchButton_xpath="//input[@class='js_ripple search-btn']";
	private String radioGroup_xpath="//div[@id='flight_class_select_child']//li";
	private String swapCity_xpath="//i[@title='Swap Origin City and Destination City']";
	private String multicityCheckbox_id="BE_flight_multicity_checkbox";
	private String clickDoneButton_xpath="//span[@class='done']";
	
	
	//multicity text boxes source and destination
	
	public void multicitySetSourceCity1(String sourceCity){
    	//clearText(By.xpath(sourceCity_xpath));
    	sendText(By.xpath(multicitySourceCity1_xpath),sourceCity);	
    }
	
	public void multicitySetSourceCity2(String sourceCity2){
    	//clearText(By.xpath(sourceCity_xpath));
    	sendText(By.xpath(multicitySourceCity2_xpath),sourceCity2);	
    }
	
	public void multicitySetDestinationCity1(String destinationCity){
    	//clearText(By.xpath(destinationCity_xpath));
    	sendText(By.xpath(multicityDestinationCity1_xpath),destinationCity);
    	}
	
	public void multicitySetDestinationCity2(String destinationCity2){
    	//clearText(By.xpath(destinationCity_xpath));
    	sendText(By.xpath(multicityDestinationCity2_xpath),destinationCity2);  	
    }
	
	//multicity dates
	
	public String generateMonthDateXpath_multiCity1(String month, String date){
		String genericXpath= "//div[@id='PegasusCal-7']//div[@class='month-box'][.//div[contains(@class,'month-title') and contains(text(),'"+"<MONTH>"+"')]]//span[text()='"+"<DATE>"+"']";
		String monthDateXpath= genericXpath.replace("<MONTH>", month).replace ("<DATE>", date);
		return monthDateXpath;
	}
	
	public String generateMonthDateXpath_multiCity2(String month, String date){
		String genericXpath= "//div[@id='PegasusCal-8']//div[@class='month-box'][.//div[contains(@class,'month-title') and contains(text(),'"+"<MONTH>"+"')]]//span[text()='"+"<DATE>"+"']";
		String monthDateXpath= genericXpath.replace("<MONTH>", month).replace ("<DATE>", date);
		return monthDateXpath;
	}
	
	public void multicitySelectDepartDate1(String month , String date){
		String genericXpath= generateMonthDateXpath_multiCity1( month,  date);
		
		clickOn(By.xpath(multicityDepartDate1_xpath));
	    clickOn(By.xpath(String.format(genericXpath,month,date)));
	}
	
	
	public void multicitySelectDepartDate2(String month , String date){
		String genericXpath= generateMonthDateXpath_multiCity2( month,  date);
		
		clickOn(By.xpath(multicityDepartDate2_xpath));
	    clickOn(By.xpath(String.format(genericXpath,month,date)));
	}
	
	
	//roundtrip text boxes source and destination
	
	public void roundTripSetSourceCity(String sourceCity){
    	//clearText(By.xpath(sourceCity_xpath));
    	sendText(By.xpath(roundTripSource_xpath),sourceCity);	
    }
	
	public void roundTripSetDestinationCity1(String destinationCity){
    	//clearText(By.xpath(destinationCity_xpath));
    	sendText(By.xpath(roundTripDestination_xpath),destinationCity);
    	}
	public String generateMonthDateXpath_roundTrip(String month, String date){
		String genericXpath= "//div[@id='PegasusCal-0']//div[@class='month-box'][.//div[contains(@class,'month-title') and contains(text(),'"+"<MONTH>"+"')]]//span[text()='"+"<DATE>"+"']";
		String monthDateXpath= genericXpath.replace("<MONTH>", month).replace ("<DATE>", date);
		return monthDateXpath;
	}
	
	
	//roundtript dates
	
	public void roundTripSelectDepartDate(String month , String date){
		String genericXpath= generateMonthDateXpath_roundTrip( month,  date);
		
		clickOn(By.xpath(roundTripdepartDateClick_xpath));
	    clickOn(By.xpath(String.format(genericXpath,month,date)));
	}
	
	public void roundTripSelectReturnDate(String month,String date){
		String genericXpath= generateMonthDateXpath_roundTrip( month,  date);
		
		clickOn(By.xpath(roundTripreturnDateClick_xpath));
	    clickOn(By.xpath(String.format(genericXpath,month,date)));	
	}
	
	
	
	public void clickSearchButton(){
		waitInSeconds(2);
		clickOn(By.xpath(searchButton_xpath));
		
		
	}
		
	
	
	public void setAdultSpiner(int adultCount){
	     //waitInSeconds(1);
		clickOn(By.xpath(travelDropdown_xpath));
		clickAdult(By.xpath(adultSpinner_xpath),adultCount);
		
	
	}

	public void setchildSpiner(int childCount){
		
		//clickOn(By.xpath(travelDropdown_xpath));
		clickOnChildorInfant(By.xpath(childSpinner_xpath),childCount);
	
	}
	
	
public void setinfantSpiner(int infantCount){
		
		//clickOn(By.xpath(travelDropdown_xpath));
		clickOnChildorInfant(By.xpath(infantSpinner_xpath),infantCount);
	
	}


/*public void selectByNameRadio ( int countOption) {

clickRadio(By.xpath(radioGroup_xpath),countOption);
}*/

public void selectByNameRadio ( String optionName) {

clickRadio(By.xpath(radioGroup_xpath),optionName);
}
    
public void clickDoneButton(){
	
	clickOn(By.xpath(searchButton_xpath));
	
}
public void swapCity(){
	//setSourceCity(sourceCity);
	//setDestinationCity(destinationCity);
	//waitInSeconds(1);
	//mouseHover(By.xpath(swapCity_xpath));
	clickSwap(By.xpath(swapCity_xpath));
	
}


public boolean isMulticitySelected(){
	
	boolean checkedAttribute = getcheckboxvalue(By.id(multicityCheckbox_id));
	
	return checkedAttribute;
		
}



}

	

/*
 SearchFlight search = new SearchFlight(driver);
  
  By firstAutocompleteDdown = By.xpath("//div[@class='ac_results' and not(contains(@style,'display: none'))]//div[@class='viewport']//li[1]");
  WebDriverWait wait = new WebDriverWait(driver, 10);
  //roundtrip travel selection
  //search.roundTripSetSourceCity(fromCity1);
  driver.findElement(By.xpath("//input[@id='BE_flight_origin_city']")).sendKeys(fromCity1+Keys.DOWN);
  //Thread.sleep(1000);
  
  wait.until(ExpectedConditions.elementToBeClickable(firstAutocompleteDdown));
  driver.findElement(firstAutocompleteDdown).click();
  //search.roundTripSetDestinationCity1(toCity1);
  driver.findElement(By.xpath("//input[@id='BE_flight_arrival_city']")).sendKeys(toCity1+Keys.DOWN);
  //Thread.sleep(1000);
  wait.until(ExpectedConditions.elementToBeClickable(firstAutocompleteDdown));
  driver.findElement(firstAutocompleteDdown).click();
  
  
  
  $x("//frame|//iframe")
  
  https://git-scm.com/downloads
  
  */
