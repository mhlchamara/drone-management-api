package com.dronecorp.drone.management.registration.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Data
public class RegistrationRequest {
    @NotNull
    String serialNumber;

    @NotNull
        String model;

    @NotNull
    int weightLimit;

    @NotNull
    BigDecimal batteryCapacity;
}
