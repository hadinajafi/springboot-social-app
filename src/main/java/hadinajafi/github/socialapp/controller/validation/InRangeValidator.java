package hadinajafi.github.socialapp.controller.validation;


import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.lang.annotation.Annotation;

/**
 * @author Hadi Najafi
 */

public class InRangeValidator implements ConstraintValidator {
	@Override
	public void initialize(Annotation constraintAnnotation) {
		ConstraintValidator.super.initialize(constraintAnnotation);
	}

	@Override
	public boolean isValid(Object value, ConstraintValidatorContext context) {
		return false;
	}
}
