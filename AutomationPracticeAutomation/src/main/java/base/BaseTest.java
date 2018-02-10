package base;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import util.Configuration;

public class BaseTest {
	
	WebDriver driver;
	@Before
	public void initialSetUp(Method method){
		String browserName = Configuration.getBrowser();
		driver = getDriver(browserName);
	}
	
	@After()
	public void cleanup(){
		driver.quit();
	}
	
	public WebDriver getDriver(String browserName){
		WebDriver driver=null;
		switch(browserName){
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "binaries/chromedriver.exe");
			ChromeOptions cOptions = new ChromeOptions();
			Map<String, Object> chromePrefs = new HashMap<String, Object>();
			chromePrefs.put("profile.default_content_setting_values.notifications", 2);
			chromePrefs.put("credentials_enable_service", false);
			cOptions.setExperimentalOption("prefs", chromePrefs);
			cOptions.addArguments("disable-infobars");
			driver = new ChromeDriver(cOptions);
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "binaries/geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		case "ie":
			System.setProperty("webdriver.ie.driver", "binaries/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			break;
		default:
			System.out.println("Please provide correct browser name");
			System.exit(0);
		}
		
		driver.manage().window().maximize();
		driver.get(Configuration.getURL());
		return driver;
	}
}
