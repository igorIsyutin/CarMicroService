package com.test_task.ah.controllers;

import com.test_task.ah.services.CarService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/car/")
public class CarController {

    private CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("getModelsByBrand/{brandName}")
    public List<String> getCarModelsByBrandName(@PathVariable String brandName){
        return carService.getCarModelsByBrandName(brandName);
    }
}
