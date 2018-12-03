package com.test_task.ah.repositories;

import com.test_task.ah.enteties.Car;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Repository
public class MockedCarRepository {
    private List<Car> cars = Arrays.asList(
            Car.builder().brandName("BMW").models(Arrays.asList("X1", "X2", "X3")).build(),
            Car.builder().brandName("Audi").models(Arrays.asList("a1", "a2", "a3")).build()
    );

    public Optional<Car> findByBrandName(String brandName) {
        Car result = null;
        for (Car car : cars){
            if(car.getBrandName().equalsIgnoreCase(brandName))
                result = car;
        }
        return Optional.ofNullable(result);
    }
}