package com.test_task.ah.enteties;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Car {
    private String id;

    private String brandName;
    private List<String> models;
}
