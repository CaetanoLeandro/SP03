package com.sp03.sprint03.v1.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Document(collection = "cars")
public class CarsModel {
    @Id
    private String id;
    @NonNull
    private String name;
    private String model;
    private String color;
    private Double price;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private LocalDateTime dataSale;
}
