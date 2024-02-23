package com.iky.controller.validation;

import static com.iky.constant.CommonConstant.DEFAULT_DATE_FORMAT;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE,
    ElementType.CONSTRUCTOR, ElementType.PARAMETER, ElementType.TYPE_USE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = DateValidator.class)
public @interface ValidDate {

  String message() default "Invalid date format, required format: " + DEFAULT_DATE_FORMAT;

  Class<?>[] groups() default {};

  Class<? extends Payload>[] payload() default {};

  String pattern() default "dd/MM/yyyy";
}
