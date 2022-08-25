package com.example.demo.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="flight")

public class Flight {

    @Id
    String flightNumberId;

    @Column(name = "aircraft_id")
    String aircraftId;

    @Column(name = "flight_milage")
    int flightMilage;


    public String getFlightNumberId() {
        return flightNumberId;
    }

    public void setFlightNumberId(String flightNumberId) {
        this.flightNumberId = flightNumberId;
    }

    public String getAircraftId() {
        return aircraftId;
    }

    public void setAircraftId(String aircraftId) {
        this.aircraftId = aircraftId;
    }

    public int getFlightMilage() {
        return flightMilage;
    }

    public void setFlightMilage(int flightMilage) {
        this.flightMilage = flightMilage;
    }
}
