package com.example.demo.repository;

import com.example.demo.model.Aircraft;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AircreaftRepositoryTest {

    @Autowired
    private AircraftRepository aircreaftRepository;

    @AfterEach
    public void tearDown(){
        //aircreaftRepository.deleteAll();
    }

    @Test
    void create_aircraft() {
        Aircraft aircraft = new Aircraft();

        aircraft.setAircraft("Ave 2002");
        aircraft.setAircraftSeats(2000);

        aircreaftRepository.save(aircraft);

        Optional<Aircraft> aircraftFromDb = aircreaftRepository.findById("Ave 2002");
        assertTrue(aircraftFromDb.isPresent());

        assertEquals(aircraft.getAircraft(),aircraftFromDb.get().getAircraft());
        assertEquals(aircraft.getAircraftSeats(),aircraftFromDb.get().getAircraftSeats());
    }

    @Test
    void find_aircraft_boeing(){
        List<Aircraft> solution = aircreaftRepository.findAllByAircraftContaining("Boeing");
        Integer size = solution.size();

        assertEquals(2,size);
    }
}