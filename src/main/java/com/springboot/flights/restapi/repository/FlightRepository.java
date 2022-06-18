package com.springboot.flights.restapi.repository;

import com.springboot.flights.restapi.entity.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight, Long> {
}
