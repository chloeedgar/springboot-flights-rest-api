package com.springboot.flights.restapi.entity;


import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "tripDetails")
public class Trip {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // each trip can have multiple flights
    // one trip to many flights relationship
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Flight> flights = new HashSet<>();
    //orphanRemoval - does it make sense for the trip to still exist without the flights?

    private BigDecimal totalBaggageCost;
    private BigDecimal totalFlightCost;
    private BigDecimal totalCost;








}
