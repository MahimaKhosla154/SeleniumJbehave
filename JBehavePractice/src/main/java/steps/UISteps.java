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
		System.out.println("Hellow 1");
		WebdriverUtility.getFireFoxBrowser();
	}
	
	@When("I enter $url")
	public void openURL(final String url) {
		System.out.println("Hellow 2");
		WebdriverUtility.openURL(url);
	}
	
	@Then("$title is displayed")
	public void validate(final String title) {
		System.out.println("Hellow 2");
		BasicPageObjects basic = new BasicPageObjects(WebdriverUtility.getInstance());
		AbstractValidator.validateIfStringsMatch(title, basic.getPageTitle());
	}
}
