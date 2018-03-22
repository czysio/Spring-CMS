package pl.krzysiek.olejnik.cms.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ArticleContentMinLengthValidator implements ConstraintValidator<ArticleContentMinLength, String> {

	@Override
    public void initialize(ArticleContentMinLength constraintAnnotation) {
    }
	
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return value.length() >= 500;
    }
	
}
