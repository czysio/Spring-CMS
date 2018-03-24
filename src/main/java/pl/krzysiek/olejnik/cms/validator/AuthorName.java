package pl.krzysiek.olejnik.cms.validator;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = AuthorNameValidator.class)
@Target({ ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface AuthorName {

	String message() default "Name should start with capital letter and be longer than 2 characters";
	Class<?>[] groups() default {};
	Class<? extends Payload>[] payload() default {};
	
}
