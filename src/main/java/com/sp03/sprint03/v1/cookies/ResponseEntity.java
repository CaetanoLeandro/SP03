package com.sp03.sprint03.v1.cookies;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ResponseEntity {

    final String name;
    final String value;


}
