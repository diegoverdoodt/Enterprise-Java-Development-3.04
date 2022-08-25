package com.example.demo.service;

import com.example.demo.model.Aircraft;
import com.example.demo.repository.AircraftRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AircraftServiceImpl implements AircraftService{

    @Autowired
    AircraftRepository aircraftRepository;

    @Override
    public List<Aircraft> listAircrafts() {
        return aircraftRepository.findAll();
    }

    @Override
    public void addAircraft(Aircraft aircraft){
        aircraftRepository.save(aircraft);
    }
}
