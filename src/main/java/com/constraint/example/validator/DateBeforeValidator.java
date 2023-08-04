package com.constraint.example.validator;

import com.constraint.example.request.Course;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class DateBeforeValidator implements ConstraintValidator<DateValidator, Course> {
    
    @Override
    public boolean isValid(Course courseRequest, ConstraintValidatorContext constraintValidatorContext) {
        try {
            if (courseRequest.getEndDate() != null) {
                return courseRequest.getStartDate().isBefore(courseRequest.getEndDate());
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}