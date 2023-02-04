package com.dronecorp.drone.management.registration;

import com.dronecorp.drone.management.registration.dto.RegistrationRequest;
import com.dronecorp.drone.management.registration.dto.RegistrationResponse;
import com.dronecorp.drone.management.repository.model.Drone;
import com.dronecorp.drone.management.repository.model.State;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.Objects;

@Component
public class RegistrationObjectMapper {
    public static Drone registrationRequestToDrone(
            RegistrationRequest registrationRequest) {
        if (Objects.isNull(registrationRequest)) {
            return null;
        }

        return new Drone(registrationRequest.getSerialNumber(),
                registrationRequest.getModel(),
                registrationRequest.getWeightLimit(),
                registrationRequest.getBatteryCapacity(),
                State.IDLE,
                Collections.emptySet());
    }

    public static RegistrationResponse droneToRegistrationResponse(Drone drone) {
        if (Objects.isNull(drone)) {
            return null;
        }

        return new RegistrationResponse(drone.getSerialNumber(),
                drone.getModel(),
                drone.getWeightLimit(),
                drone.getBatteryCapacity(),
                drone.getState().toString());
    }
}
