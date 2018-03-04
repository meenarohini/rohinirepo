package base;

import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.ProtocolHandshake;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.openqa.selenium.remote.ProtocolHandshake.Result.*;
import org.openqa.selenium.remote.ProtocolHandshake.*;

import util.PropertyReader;

public class BaseTest {

	protected WebDriver driver;
	
	@BeforeMethod
	public void initialSetup(){
  String browserName = PropertyReader.getProperty("browser");
      driver = getDriver(browserName);
	}
	public WebDriver getDriver(String browserName){
		
		switch(browserName){
		
		case "chrome":{
			System.setProperty("webdriver.chrome.driver","binaries1/chromedriver.exe");
			//ChromeOptions cOptions = new ChromeOptions();
			//Map<String, Object> chromePrefs = new HashMap<String, Object>();
			//chromePrefs.put("profile.default_content_setting_values.notifications", 2);
			//chromePrefs.put("credentials_enable_service", false);
			//cOptions.setExperimentalOption("prefs", chromePrefs);
			//cOptions.addArguments("disable-infobars");
			//driver = new ChromeDriver(cOptions);
			driver = new ChromeDriver();
			break;}
		case "Firefox":{
		
			System.setProperty("webdriver.gecko.driver", "binaries2/geckodriver.exe");
			/*DesiredCapabilities capabilities = DesiredCapabilities.firefox();
			FirefoxOptions fOptions = new FirefoxOptions();
			fOptions.setLogLevel(Level.SEVERE);
			capabilities.setCapability("moz:firefoxOptions", fOptions);
			capabilities.setCapability("marinette", true);
			driver = new FirefoxDriver(capabilities);*/
			
			driver = new FirefoxDriver();
			
			break;
			
		}
			
		case "ie":
			System.setProperty("webdriver.ie.driver", "binaries/IEDriverServer.exe");
			break;
			default :
				System.out.println("Enter the correct browser name");
				System.exit(0);
			
		}
		/*public ProtocolHandshake.Result createSession(HttpClient client,
                Command command)
         throws java.io.IOException
Throws:
java.io.IOException*/
		
		driver.get(PropertyReader.getProperty("url"));
		//driver.manage().deleteAllCookies();
		//driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS); 
		
		
		//driver.navigate().refresh();
		
		driver.manage().window().maximize();
		return driver;
	}
	
	@AfterMethod
	public void cleanUp(){
		//driver.close();
		//driver.quit();
		//driver=null;
	}
}