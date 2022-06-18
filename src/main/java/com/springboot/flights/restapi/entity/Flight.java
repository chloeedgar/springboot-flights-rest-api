package com.springboot.flights.restapi.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;


@Data
@Entity
@Table(name = "flights")
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //each airline can have many flights
    //each flight has only one airline. Hence, one-to-many relationship
    @ManyToOne
    @JoinColumn(name = "airline_id", nullable = false)
    private Airline airline;

    @ManyToOne(fetch = FetchType.LAZY) //tells Hibernate to only fetch the related entities from the db when you use the relationship
    @JoinColumn(name = "origin_airport_id", nullable = false)
    private Airport origin;

    @ManyToOne(fetch = FetchType.LAZY) //tells Hibernate to only fetch the related entities from the db when you use the relationship
    @JoinColumn(name = "destination_airport_id", nullable = false, insertable = false, updatable = false)
    private Airport destination;

    @Column(name="departure_time",nullable = false)
    private LocalDateTime departureDateTimes;

    @Column(name="arrival_time",nullable = false)
    private LocalDateTime arrivalDateTimes;

    @Column(nullable = false)
    private int flightDuration;

    @Column(nullable = false)
    private int stops;

    @Enumerated(value = EnumType.STRING) //nullable=true/default=economy?
    private FlightClass flightClass;

    @Column(nullable = false)
    private BigDecimal price;




}
