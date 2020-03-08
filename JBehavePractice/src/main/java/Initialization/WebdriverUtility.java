package Initialization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;

import java.lang.IllegalStateException;
public class WebdriverUtility {
	private static WebDriver driver = null;
	
	public static WebDriver getInstance() {
		if (driver == null) {
			throw new IllegalStateException("Webdriver needs to be initialized first. Aborthing.");
		} 
		return driver;
	}

    public static WebDriver getFireFoxBrowser() {
        if (driver == null) {
            System.setProperty("webdriver.gecko.driver","/usr/local/bin/geckodriver");
            driver = new FirefoxDriver();
            return driver;
        }
        return driver;
    }
    
    public static WebDriver getChromeBrowserInstanceWithOptions() {
    	if(driver == null) {
    	     ChromeOptions chromeOptions = new ChromeOptions();
    	     chromeOptions.addArguments("--disable-extensions");
    	     driver = new ChromeDriver(chromeOptions);
    	     driver.manage().window().maximize();
    	}
    	return driver;
    }
    
    public static WebDriver getChromeBrowser() {
    	if(driver == null) {
    	     driver = new ChromeDriver();
    	}
    	return driver;
    }
    
    public static void openURL(final String url) {
    	if (driver == null) {
    		throw new IllegalStateException("Webdriver needs to be initialized first. Aborthing.");
    	}
    	driver.get(url);
    }
    
    public static void quitAllDriverSessions() {
    	driver.close();
    }
    
}
