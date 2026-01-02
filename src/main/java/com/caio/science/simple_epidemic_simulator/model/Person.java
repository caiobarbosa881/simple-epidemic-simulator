package com.caio.science.simple_epidemic_simulator.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public HealthStatus getStatus() {
        return status;
    }

    public void setStatus(HealthStatus status) {
        this.status = status;
    }

    public int getDaysInfected() {
        return daysInfected;
    }

    public void setDaysInfected(int daysInfected) {
        this.daysInfected = daysInfected;
    }

    @Enumerated(EnumType.STRING)
    private HealthStatus status;

    private int daysInfected;

    // getters e setters
}
