package com.sp03.sprint03.api.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

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
    private LocalDate dataSale;
}
