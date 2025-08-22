package com.ozalp.sportcenter.exceptionHandler.handlers;

import com.ozalp.sportcenter.common.utilities.results.ErrorDataResult;
import com.ozalp.sportcenter.exceptionHandler.exceptions.EntityNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class EntityExceptionHandler {

    @ExceptionHandler(EntityNotFoundException.class)
    ResponseEntity<?> entityNotFoundException(EntityNotFoundException e) {
        return new ResponseEntity<>(new ErrorDataResult<>(e.getLocalizedMessage()), HttpStatus.BAD_REQUEST);
    }
}
