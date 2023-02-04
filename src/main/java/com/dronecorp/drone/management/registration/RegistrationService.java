package com.dronecorp.drone.management.registration;

import com.dronecorp.drone.management.repository.model.Drone;
import com.dronecorp.drone.management.registration.dto.RegistrationRequest;
import com.dronecorp.drone.management.registration.dto.RegistrationResponse;
import com.dronecorp.drone.management.repository.DroneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {
    @Autowired
    DroneRepository droneRepository;

    public RegistrationResponse register(RegistrationRequest registrationRequest) {
        Drone drone = RegistrationObjectMapper.registrationRequestToDrone(registrationRequest);

        RegistrationResponse registrationResponse = RegistrationObjectMapper
                .droneToRegistrationResponse(droneRepository.save(drone));

        return registrationResponse;
    }
}
