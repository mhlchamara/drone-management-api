package com.dronecorp.drone.management.web.controllers;

import com.dronecorp.drone.management.observe.ObserveService;
import com.dronecorp.drone.management.observe.dto.ObserveDroneResponse;
import com.dronecorp.drone.management.registration.RegistrationService;
import com.dronecorp.drone.management.registration.dto.RegistrationResponse;
import com.dronecorp.drone.management.registration.dto.RegistrationRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Objects;


@RestController
@RequestMapping(path="/drone/v1/management")
public class DroneManagementController {
    @Autowired
    RegistrationService registrationService;

    @Autowired
    ObserveService observeService;

    @PostMapping(value="/registration",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    ResponseEntity<RegistrationResponse> register (
            @Valid @RequestBody RegistrationRequest registrationRequest
    ) {
        return ResponseEntity
                .ok(registrationService.register(registrationRequest));
    }

    @GetMapping(value="/observe/drone/{serialNumber}",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    ResponseEntity<ObserveDroneResponse> observeDrone (
            @PathVariable final String serialNumber
    ) {
        return Objects.isNull(observeService.observeDrone(serialNumber)) ?
            ResponseEntity.notFound().build() :
                ResponseEntity.ok(observeService.observeDrone(serialNumber));
    }
}
