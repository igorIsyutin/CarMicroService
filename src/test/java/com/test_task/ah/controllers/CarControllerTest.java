package com.test_task.ah.controllers;

import com.test_task.ah.services.CarService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.mockito.BDDMockito.given;
import static org.mockito.MockitoAnnotations.initMocks;

public class CarControllerTest {
    private CarController carController;

    @Mock
    private CarService carService;

    @Before
    public void init() throws Exception{
        initMocks(this);
        carController = new CarController(carService);
    }

    @Test
    public void getCarModelsByBrandName() {
        List<String> expectedResult = Arrays.asList("X1", "X2", "X3");
        given(carService.getCarModelsByBrandName("BMW"))
                .willReturn(expectedResult);
        List<String> response = carController.getCarModelsByBrandName("BMW");
        assertArrayEquals(expectedResult.toArray(), response.toArray());
    }
}