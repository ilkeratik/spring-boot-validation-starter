package com.iky.controller.validation;


import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateValidator implements ConstraintValidator<ValidDate, String> {

  private String pattern;

  @Override
  public void initialize(ValidDate constraintAnnotation) {
    this.pattern = constraintAnnotation.pattern();
  }

  @Override
  public boolean isValid(String value, ConstraintValidatorContext context) {
    if (value == null || value.isEmpty()) {
      return false;
    }
    try {
      LocalDate date = LocalDate.parse(value, DateTimeFormatter.ofPattern(pattern));
      return !date.isAfter(LocalDate.now());
    } catch (DateTimeParseException e) {
      return false;
    }
  }
}

