package com.example.demo.repository;

import com.example.demo.model.Flight;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class FlightRepositoryTest {

    @Autowired
    private FlightRepository flightRepository;

    @AfterEach
    public void tearDown(){
        //flightRepository.deleteAll();
    }

    @Test
    void create_flight(){
        Flight flight = new Flight();

        flight.setFlightNumberId("AlaMierda");
        flight.setAircraftId("EnPicao");
        flight.setFlightMilage(1221);

        flightRepository.save(flight);

        Optional<Flight> flightFromDb = flightRepository.findById("AlaMierda");
        assertTrue(flightFromDb.isPresent());

        assertEquals(flight.getAircraftId(), flightFromDb.get().getAircraftId());
        assertEquals(flight.getFlightNumberId(), flightFromDb.get().getFlightNumberId());
        assertEquals(flight.getFlightMilage(), flightFromDb.get().getFlightMilage());
    }


    @Test
    void test_findByFlightNumberId(){

        Flight flight = new Flight();
        flight.setFlightMilage(1221);
        flight.setFlightNumberId("AlaMierda");
        flight.setAircraftId("EnPicao");

        flightRepository.save(flight);
        Optional<Flight> flightFromDb = Optional.ofNullable(flightRepository.findByFlightNumberId("AlaMierda"));
        assertTrue(flightFromDb.isPresent());

        assertEquals(flight.getFlightMilage(), flightFromDb.get().getFlightMilage());
        assertEquals(flight.getFlightNumberId(), flightFromDb.get().getFlightNumberId());
        assertEquals(flight.getAircraftId(), flightFromDb.get().getAircraftId());
    }


    @Test
    void test_findByFlightMilageGreaterThan(){
        List<Flight> selection = flightRepository.findAllByFlightMilageGreaterThan(500);

        Integer a = selection.size();

        assertEquals(4, a);


    }


}