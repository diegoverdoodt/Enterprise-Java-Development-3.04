package com.example.demo.service;

import com.example.demo.model.Aircraft;

import java.util.List;


public interface AircraftService {

    List<Aircraft> listAircrafts();

    void addAircraft(Aircraft aircraft);
}
