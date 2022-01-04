package com.sp03.sprint03.v1.repository;

import com.sp03.sprint03.v1.model.CarsModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CarsRepository extends MongoRepository<CarsModel, String> {
}
