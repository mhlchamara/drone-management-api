package com.dronecorp.drone.management.repository.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Set;

@Entity
@Table(name = "drones")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Drone implements Serializable {
    @Id
    String serialNumber;

    String model;

    int weightLimit;

    BigDecimal batteryCapacity;

    @Enumerated(EnumType.STRING)
    State state;

    @OneToMany(mappedBy="drone")
    private Set<Medication> medications;
}
