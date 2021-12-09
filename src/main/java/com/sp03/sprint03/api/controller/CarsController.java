package com.sp03.sprint03.api.controller;

import com.sp03.sprint03.api.model.CarsModel;
import com.sp03.sprint03.api.service.CarService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/car")
public class CarsController {

    private final CarService service;

    @PostMapping
    public CarsModel saveCar(@RequestBody CarsModel carsModel) {  //TODO @Valid (model @NotBlank
        return service.saveCar(carsModel);
    }

    @PutMapping("/{id}")
    public CarsModel updateCarById(@RequestBody CarsModel carsModel, @PathVariable String id){
        return service.updateCarById(carsModel, id);
    }

    @GetMapping("/{id}")
    public CarsModel findById(@PathVariable String id) {
        return service.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable String id){
      service.deleteById(id);
    }

    @GetMapping("/findAll")
    public List <CarsModel> findAll(){
        return service.findAll();
    }

}
