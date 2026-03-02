package com.praktikum1.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validator;
import lombok.AllArgsConstructor;

import java.util.Set;
import jakarta.validation.ConstraintViolationException;

@Component
@AllArgsConstructor
public class ValidationUtil {
    @Autowired
    private Validator validator;
    public void validate(Object request) throws ConstraintViolationException {
        Set<ConstraintViolation<Object>> constraintViolations = validator.validate(request);
        if (!constraintViolations.isEmpty()) {
            throw new ConstraintViolationException(constraintViolations);
        }
    }
}
