package UIUtilities;

import org.openqa.selenium.WebDriver;

public class BasicPageObjects {
	
	WebDriver driver = null;
	
	public BasicPageObjects(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}
}
