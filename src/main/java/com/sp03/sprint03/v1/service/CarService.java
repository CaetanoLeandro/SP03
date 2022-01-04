package com.sp03.sprint03.v1.service;

import com.sp03.sprint03.v1.exceptions.notfound.NotFoundException;
import com.sp03.sprint03.v1.model.CarsModel;
import com.sp03.sprint03.v1.repository.CarsRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

@AllArgsConstructor
@Service
public class CarService {

    private final CarsRepository carsRepository;

    public CarsModel saveCar(CarsModel carsModel) {
        carsModel.setData();
        return carsRepository.save(carsModel);
    }

    public CarsModel findById( String id) {
        return carsRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("ID not found"));
    }

    public CarsModel updateCarById(CarsModel carsModel,String id) {
        CarsModel carsModel1 = carsRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("ID not found"));
        carsModel.setId(carsModel1.getId());
        return carsRepository.save(carsModel);
    }

    public  CarsModel patchCarByColor(CarsModel carsModel, String id){
        CarsModel carsModel1 = carsRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("ID not found"));
        carsModel1.setColor(carsModel.getColor());
        return carsRepository.save(carsModel1);
    }
    public List<CarsModel> findAll() {
        return carsRepository.findAll();
    }

    public void deleteById(List<String> id) {
        if(!CollectionUtils.isEmpty(id)) {
            var del =carsRepository.findAllById(id);
            carsRepository.deleteAll(del);
        }
        else{
            carsRepository.deleteAll(carsRepository.findAll());
        }
    }
}