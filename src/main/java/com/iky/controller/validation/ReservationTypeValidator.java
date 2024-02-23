package com.iky.controller.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import java.util.Arrays;

public class ReservationTypeValidator implements
    ConstraintValidator<ValidEnum, CharSequence> {

  private ValidEnum annotation;

  @Override
  public void initialize(ValidEnum annotation) {
    this.annotation = annotation;
  }

  @Override
  public boolean isValid(CharSequence value, ConstraintValidatorContext context) {
    if (value == null) {
      return false;
    }
    Enum<?>[] enumConstants = this.annotation.enumClass().getEnumConstants();
    if (enumConstants == null) {
      return false;
    }
    return Arrays.stream(enumConstants).anyMatch(e -> e.name().equals(value.toString()));
  }
}