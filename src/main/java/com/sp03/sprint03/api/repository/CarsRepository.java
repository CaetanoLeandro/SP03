package com.sp03.sprint03.api.repository;

import com.sp03.sprint03.api.model.CarsModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CarsRepository extends MongoRepository<CarsModel, String> {

}
