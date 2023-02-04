package com.dronecorp.drone.management.repository;

import com.dronecorp.drone.management.repository.model.Drone;
import org.springframework.data.repository.CrudRepository;

public interface DroneRepository extends CrudRepository<Drone, String>  {
}
