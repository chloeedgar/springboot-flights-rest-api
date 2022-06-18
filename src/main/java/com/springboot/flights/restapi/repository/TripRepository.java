package com.springboot.flights.restapi.repository;

import com.springboot.flights.restapi.entity.Trip;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TripRepository extends JpaRepository<Trip, Long> {
}
