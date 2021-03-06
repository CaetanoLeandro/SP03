package com.sp03.sprint03.v1.exceptions.details;

import lombok.Data;
import lombok.experimental.SuperBuilder;

import java.time.Instant;

@SuperBuilder
@Data
public class RestExceptionDetails {

    private Integer status;
    private String title;
    private Instant timestamp;
    private String details;
    private String developerMessage;

}