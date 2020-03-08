package steps;

import org.jbehave.core.steps.Steps;

import Initialization.WebdriverUtility;
import validationModule.AbstractValidator;
import UIUtilities.BasicPageObjects;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.When;
import org.jbehave.core.annotations.Then;

public class UISteps extends Steps{
	
	@Given("I open a browser")
	public void openBrowser() {
		WebdriverUtility.getFireFoxBrowser();
	}
	
	@When("I enter $url")
	public void openURL(final String url) {
		WebdriverUtility.openURL(url);
	}
	
	@Then("$title is displayed")
	public void validate(final String title) {
		BasicPageObjects basic = new BasicPageObjects(WebdriverUtility.getInstance());
		AbstractValidator.validateIfStringsMatch(title, basic.getPageTitle());
	}
	
	@When("I close the browser and all sessions")
	public void closeBrowser() {
		WebdriverUtility.quitAllDriverSessions();
	}
}
