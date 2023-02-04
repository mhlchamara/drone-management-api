package com.dronecorp.drone.management.repository;

import com.dronecorp.drone.management.repository.model.Medication;
import org.springframework.data.repository.CrudRepository;

public interface MedicationRepository extends CrudRepository<Medication, String> {
}
