package com.dronecorp.drone.management.observe;

import com.dronecorp.drone.management.repository.model.Drone;
import com.dronecorp.drone.management.observe.dto.ObserveDroneResponse;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class ObserveObjectMapper {
    public static ObserveDroneResponse droneToObserveDroneResponse
            (Drone drone) {
        if (Objects.isNull(drone)) {
            return null;
        }

        return new ObserveDroneResponse(drone.getSerialNumber(),
                drone.getModel(),
                drone.getWeightLimit(),
                drone.getBatteryCapacity(),
                drone.getState().toString());
    }
}
