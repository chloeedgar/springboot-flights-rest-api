package com.springboot.flights.restapi.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
public class Airport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String countryCode; //make this a length of 3/4?

    private String city; //There could be multiple airports in one city

    private String country;

    //each airport can have many flights
    //each flight has only one origin airport and one destination airport.
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Flight> flights = new HashSet<>();
}
