package com.sp03.sprint03.api.controller;

import com.sp03.sprint03.api.model.CarsModel;
import com.sp03.sprint03.api.repositories.CarsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/controller")
public class CarsController {

    @Autowired // Injeta essa instância, na propriedade/classe abaixo, sem a necessidade de criar "new", Instanciar
    CarsRepository carsRepository;

    @PostMapping
    public CarsModel getCar(@RequestBody CarsModel carsModel) {
        return carsRepository.save(carsModel);
    }

    @GetMapping("/{id}")
    public CarsModel getCar(@PathVariable Integer id) {
        return carsRepository.findById(id).orElseThrow();
    }

    @PutMapping("/{id}")
    public CarsModel updateCar(@RequestBody CarsModel carsModel, @PathVariable Integer id){
        return carsRepository.update(carsModel, id);
    }

    @DeleteMapping("/{id}")
    public void deleteCar(@PathVariable Integer id){
      carsRepository.deleteById(id);
    }
}
