package com.sp03.sprint03.api.service;


import com.sp03.sprint03.api.model.CarsModel;
import com.sp03.sprint03.api.repository.CarsRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

import static org.springframework.http.HttpStatus.NOT_FOUND;

@AllArgsConstructor
@Service
public class CarService {

    private final CarsRepository carsRepository;

    public CarsModel saveCar(@RequestBody CarsModel carsModel) {
        return carsRepository.save(carsModel);
    }

    public CarsModel findById(@PathVariable String id) {
        return carsRepository.findById(id)
                .orElseThrow(()-> new ResponseStatusException(NOT_FOUND, "ID not found"));
    }

    public CarsModel updateCarById(@RequestBody CarsModel carsModel, @PathVariable String id) {
        CarsModel carsModel1 = carsRepository.findById(id)
                .orElseThrow(()-> new ResponseStatusException(NOT_FOUND, "ID not found"));
        carsModel.setId(carsModel1.getId());
        return carsRepository.save(carsModel);
    }

    public void deleteById(@PathVariable String id) {
        carsRepository.findById(id)
                .orElseThrow(()-> new ResponseStatusException(NOT_FOUND, "ID not found"));
        carsRepository.deleteById(id);
    }

    public List<CarsModel> findAll() {
        return carsRepository.findAll();
    }

}