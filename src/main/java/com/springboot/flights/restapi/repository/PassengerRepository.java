package com.springboot.flights.restapi.repository;

import com.springboot.flights.restapi.entity.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {
}
