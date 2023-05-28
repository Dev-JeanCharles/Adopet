package com.fourtk.Adopet.services.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Constraint(validatedBy = CpfValidator.class)
@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
public @interface CpfValid {
        String message() default "Validation error";
        Class<?>[] groups() default {};
        Class<? extends Payload>[] payload() default {};

    }

