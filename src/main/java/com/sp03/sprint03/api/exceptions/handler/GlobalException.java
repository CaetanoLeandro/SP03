package com.sp03.sprint03.api.exceptions.handler;

import com.sp03.sprint03.api.exceptions.details.ExceptionDetails;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.time.Instant;

import static org.springframework.http.HttpStatus.NOT_FOUND;

public class GlobalException {

    @ExceptionHandler(ChangeSetPersister.NotFoundException.class)
    @ResponseStatus(NOT_FOUND)
    public ExceptionDetails handlerNotFoundException(ChangeSetPersister.NotFoundException e){
        ExceptionDetails exceptionDetails;
        exceptionDetails = ExceptionDetails.builder()
                .status(NOT_FOUND.value())
                .title("Not found")
                .timestamp(Instant.now())
                .details(e.getMessage())
                .developerMessage("Include a valid ID. Make sure it exists.")
                .build();
        return exceptionDetails;
    }
}
