package pl.krzysiek.olejnik.cms.validator;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = ArticleContentMinLengthValidator.class)
@Target({ ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface ArticleContentMinLength {

	String message() default "Content should cointain at least 500 characters";
	Class<?>[] groups() default {};
	Class<? extends Payload>[] payload() default {};
}
