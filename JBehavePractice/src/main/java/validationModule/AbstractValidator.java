package validationModule;

import org.junit.Assert;

public class AbstractValidator {
	
	public boolean validateIfStringsMatch(final String actual, final String expected) {
		 return actual.equalsIgnoreCase(expected);
	}

}
