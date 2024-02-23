package com.iky.controller.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = ReservationTypeValidator.class)
public @interface ValidEnum{
  Class<? extends Enum<?>> enumClass();

  String message() default "must be any of enum {enumClass}";

  Class<?>[] groups() default {};

  Class<? extends Payload>[] payload() default {};
}