package com.springboot.flights.restapi.repository;

import com.springboot.flights.restapi.entity.Airline;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AirlineRepository extends JpaRepository<Airline,Long> {
}
