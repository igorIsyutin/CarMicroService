package com.test_task.ah.services;

import com.test_task.ah.enteties.Car;

import java.util.List;

public interface CarService {
    List<String> getCarModelsByBrandName(String brandName);
}
