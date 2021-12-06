package com.sp03.sprint03.api.repositories;

import com.sp03.sprint03.api.model.CarsModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarsRepository extends CrudRepository<CarsModel, Integer> {

    CarsModel update(CarsModel carsModel, Integer id);

}
