package com.dronecorp.drone.management.observe;

import com.dronecorp.drone.management.observe.dto.ObserveDroneResponse;
import com.dronecorp.drone.management.repository.DroneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ObserveService {
    @Autowired
    DroneRepository droneRepository;

    public ObserveDroneResponse observeDrone(String serialNumber) {
        return ObserveObjectMapper.droneToObserveDroneResponse(
                droneRepository.findById(serialNumber).orElse(null));
    }
}
