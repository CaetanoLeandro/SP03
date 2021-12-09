package com.sp03.sprint03.api.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Document(collection = "cars")
public class CarsModel {
    @Id
    String id;
    String carsName;
    String carsModels;
    String carsColors;
    Double carsPrice;
}
