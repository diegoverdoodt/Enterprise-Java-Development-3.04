package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="aircraft")

public class Aircraft {

    @Id
    @Column(name="aircraft")
    String aircraft;

    @Column(name="aircraft_seats")
    int aircraftSeats;

    public String getAircraft() {
        return aircraft;
    }

    public void setAircraft(String aircraft) {
        this.aircraft = aircraft;
    }

    public int getAircraftSeats() {
        return aircraftSeats;
    }

    public void setAircraftSeats(int aircraftSeats) {
        this.aircraftSeats = aircraftSeats;
    }
}
