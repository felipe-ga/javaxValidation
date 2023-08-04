package com.constraint.example.validator;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({ TYPE, ANNOTATION_TYPE })
@Retention(RUNTIME)
@Constraint(validatedBy = DateBeforeValidator.class)
public @interface DateValidator {

    String message() default "the end date should be after the start date";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
