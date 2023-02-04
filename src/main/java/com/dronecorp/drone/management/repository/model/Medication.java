package com.dronecorp.drone.management.repository.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "medications")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Medication implements Serializable {
    @Id
    String name;

    int weight;
    String code;
    String imagePath;

    @ManyToOne
    @JoinColumn(name="serialNumber", nullable=false)
    private Drone drone;
}
