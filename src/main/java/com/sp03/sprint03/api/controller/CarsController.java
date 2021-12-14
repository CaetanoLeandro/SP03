package com.sp03.sprint03.api.controller;

import com.sp03.sprint03.api.model.CarsModel;
import com.sp03.sprint03.api.service.CarService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

import static org.springframework.http.HttpStatus.*;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/car")
public class CarsController {

    private final CarService service;

    @PostMapping
    @ResponseStatus(CREATED)
    public CarsModel saveCar(@RequestBody @Valid CarsModel carsModel) {
        return service.saveCar(carsModel);
    }

    @PutMapping("/{id}")
    @ResponseStatus(NO_CONTENT)
    public CarsModel updateCarById(@RequestBody @Valid CarsModel carsModel, @PathVariable String id){
        return service.updateCarById(carsModel, id);
    }

    @PatchMapping("/{id}")
    @ResponseStatus(CREATED)
    public CarsModel patchCarColor(@RequestBody @Valid CarsModel carsModel, @PathVariable String id){
        return service.patchCarByColor(carsModel, id);

    }

    @GetMapping("/{id}")
    @ResponseStatus(OK)
    public CarsModel findById(@PathVariable @Valid String id) {
        return service.findById(id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(NO_CONTENT)
    public void deleteById(@PathVariable @Valid String id){
      service.deleteById(id);
    }

    @GetMapping("/findAll")
    @ResponseStatus(OK)
    public List <CarsModel> findAll(){
        return service.findAll();
    }
}
