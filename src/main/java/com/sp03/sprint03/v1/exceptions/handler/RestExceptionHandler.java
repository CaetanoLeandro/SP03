package com.sp03.sprint03.v1.exceptions.handler;

import com.sp03.sprint03.v1.exceptions.details.RestExceptionDetails;
import com.sp03.sprint03.v1.exceptions.notfound.NotFoundException;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.Instant;


import static org.springframework.http.HttpStatus.NOT_FOUND;

@RestControllerAdvice
public class RestExceptionHandler {

    @ExceptionHandler(NotFoundException.class)
    @ResponseStatus(NOT_FOUND)
    public RestExceptionDetails handlerNotFoundException(ChangeSetPersister.NotFoundException e){
        RestExceptionDetails restExceptionDetails;
        restExceptionDetails = RestExceptionDetails.builder()
                .status(NOT_FOUND.value())
                .title("Not found")
                .timestamp(Instant.now())
                .details(e.getMessage())
                .developerMessage("Include a valid ID. Make sure it exists.")
                .build();
        return restExceptionDetails;
    }
}
