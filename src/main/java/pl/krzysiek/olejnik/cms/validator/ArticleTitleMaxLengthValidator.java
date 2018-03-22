package pl.krzysiek.olejnik.cms.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ArticleTitleMaxLengthValidator implements ConstraintValidator<ArticleTitleMaxLength, String>{

	@Override
    public void initialize(ArticleTitleMaxLength constraintAnnotation) {
    }
	
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return value.length() <= 200;
    }
	
}
