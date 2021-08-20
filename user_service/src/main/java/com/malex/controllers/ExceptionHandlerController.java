package com.malex.controllers;

import com.malex.exceptions.UserServiceException;
import com.malex.models.ErrorMessage;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandlerController {

    @ExceptionHandler(UserServiceException.class)
    public ErrorMessage handleNotFoundException(UserServiceException ex) {
        return ErrorMessage.builder()
                .error(ex.getMessage())
                .build();
    }
}