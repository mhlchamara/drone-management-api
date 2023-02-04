package com.dronecorp.drone.management.registration.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class RegistrationResponse {
    String serialNumber;
    String model;
    int weightLimit;
    BigDecimal batteryCapacity;
    String state;
}
