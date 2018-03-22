package pl.krzysiek.olejnik.cms.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CategoryNameMinLengthValidator implements ConstraintValidator<CategoryNameMinLength, String> {

	@Override
    public void initialize(CategoryNameMinLength constraintAnnotation) {
    }
	
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return value.length() >= 5;
    }
	
}
