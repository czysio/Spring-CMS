package pl.krzysiek.olejnik.cms.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class AuthorNameValidator implements ConstraintValidator<AuthorName, String> {
	
	@Override
	public void initialize(AuthorName meyhodName) {
		
	}
	
	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		return value.length() > 2 && value.matches("[A-Z][a-z]+");
	}

}
