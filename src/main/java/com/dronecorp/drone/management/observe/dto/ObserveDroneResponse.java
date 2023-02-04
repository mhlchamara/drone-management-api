package com.dronecorp.drone.management.observe.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class ObserveDroneResponse {
    String serialNumber;
    String model;
    int weightLimit;
    BigDecimal batteryCapacity;
    String state;
}
