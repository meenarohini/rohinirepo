package helper;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementActions {

	WebDriver driver = null;
	Actions actions;
	WebDriverWait wait;
	JavascriptExecutor js;
	
	public ElementActions(WebDriver driver){
		this.driver = driver;
		actions = new Actions(driver);
		wait = new WebDriverWait(driver,25);
		js = (JavascriptExecutor)driver;
		
	}
	
	
	public void waitForPageToBeLoaded(){
		long intialTime = System.currentTimeMillis();
		long currentTime = intialTime;
		long maxWaitTime = 5*60*1000;
		
		while (!(js.executeScript("return document.readyState").equals("complete")) && currentTime-intialTime<maxWaitTime) {
			try {
				Thread.sleep(200);
			} catch (Exception e) {
				e.printStackTrace();
			}
			currentTime = System.currentTimeMillis();
		}
	}
	
	public void clickOn(By locator){
		
		clickOn(locator, false);
	}
	
	public void clickOn(By locator, boolean isScrollIntoView){
		try{
			try{
				
			wait.until(ExpectedConditions.elementToBeClickable(locator));
				
				if(isScrollIntoView)
			js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(locator));
				
		driver.findElement(locator).click();
		
			}
			catch(NoSuchElementException e){
				System.out.println(""+e);
			}
	}
		catch(TimeoutException e){
			throw e;
		}
	
		//waitInSeconds(2);
		//waitForPageToBeLoaded();
	}
	
	public void mouseHover(By locator){
		//waitInSeconds(1);
		actions.moveToElement(driver.findElement(locator)).perform();
		
		
		}
		
	
	
	
	
	
		
	
	
	public void  clickAdult(By locator,int adultCount){
		try{
		for(int i = 1; i < adultCount;i++){
	    driver.findElement(locator).click();		
		}
		}
		catch(NoSuchElementException e){
			System.out.println(""+e);
		}
		}
	
	public void clickOnChildorInfant(By locator,int count){
		try{
		for(int i=1;i<=count;i++){
			driver.findElement(locator).click();
			
		}
		}
		catch(NoSuchElementException e){
			System.out.println(""+e);
		}
		}
	
	
	public void clearText(By locator){
		//wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		waitInSeconds(1);
		driver.findElement(locator).clear();
	}
	
   
	public void sendText(By locator,String text){
		waitForPageToBeLoaded();        
		//waitInSeconds(1);
                //driver.ExecuteScript("arguments[0].setAttribute('value', arguments[1])", element, text);
                
               driver.findElement(locator).sendKeys(text);
				driver.findElement(locator).sendKeys(Keys.ENTER);
				waitInSeconds(1);	
	
		
	}

	
	

	
	/*public void clickRadio(By locator,int count){
		List<WebElement> radios = driver.findElements(locator);

		if (count > 0 && count <= radios.size()) {
	        radios.get(count ).click();
	    } else {
	        throw new NotFoundException("option " + count + " not found");
	    }

		  
	}*/
	
	public void clickSwap(By locator){
		
		driver.findElement(locator).click();
		//je.executeScript("arguments[0].click();", browsebnt);
		//js.executeScript("arguments[0].click();", element);
	}
	
	public void clickRadio(By locator,String text){
		try{
		List<WebElement> radios = driver.findElements(locator);
                   int n=radios.size();
		for(WebElement radio: radios){
			System.out.println(""+radio.getText());
			if(radio.getText().equals(text))
					radio.click();
			
		}}
		catch(NoSuchElementException e){
			System.out.println(""+e);
		}
     waitInSeconds(1);
		  
	}
	
	
	
	
	
	public boolean getcheckboxvalue(By locator)
    {   
		boolean isFound=false;
		 
		 try{
		try{
		wait.until(ExpectedConditions.elementToBeClickable(locator));
		WebElement webElement=driver.findElement(locator);
       if(!webElement.isSelected()){
       
    	   webElement.click();
    	   isFound = true;
        
    }
		}
		catch(NoSuchElementException e){
			System.out.println(""+e);
		}
		 }
		 catch(TimeoutException e){
			 throw e;
		 }
		return isFound;
    }
	
	
	
	public void waitInSeconds(int seconds){
		try {
			Thread.sleep(seconds*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
