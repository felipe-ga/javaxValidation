package com.constraint.example.request;

import com.constraint.example.validator.DateValidator;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDate;

@Data
@DateValidator
public class Course {
    @NotNull
    private LocalDate startDate;
    private LocalDate endDate;
}
