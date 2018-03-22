package pl.krzysiek.olejnik.cms.validator;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = CategoryNameMinLengthValidator.class)
@Target({ ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface CategoryNameMinLength {

	String message() default "Category name should be longer than 4 characters";
	Class<?>[] groups() default {};
	Class<? extends Payload>[] payload() default {};
}
