package com.test_task.ah.services.impl;

import com.test_task.ah.enteties.Car;
import com.test_task.ah.repositories.MockedCarRepository;
import com.test_task.ah.services.CarService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class CarServiceImpl implements CarService {
    private MockedCarRepository repository;

    public CarServiceImpl(MockedCarRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<String> getCarModelsByBrandName(String brandName) {
        if(brandName.isEmpty()) return Collections.emptyList();

        Optional<Car> byBrandName = repository.findByBrandName(brandName);
        if(byBrandName.isPresent())
            return byBrandName.get().getModels();
        else
            return Collections.emptyList();
    }
}
