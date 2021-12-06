package com.sp03.sprint03.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Encrypted;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "cars")
@Encrypted
public class CarsModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    String id;
    String carsName;
    String carsModels;
    String carsColors;
    Double carsPrice;

}
