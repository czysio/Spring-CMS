package pl.krzysiek.olejnik.cms.validator;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = ArticleTitleMaxLengthValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ArticleTitleMaxLength {
	
	String message() default "Title should not be longer than 200 characters";
	Class<?>[] groups() default {};
	Class<? extends Payload>[] payload() default {};
}
	

