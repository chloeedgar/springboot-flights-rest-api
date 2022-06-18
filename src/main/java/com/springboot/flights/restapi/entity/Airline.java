package com.springboot.flights.restapi.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "airlines")
public class Airline { // this class assumes all airlines will have only one type of plane

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String seatPitch;

    private String seatWidth;

    private String  seatRecline;

    private boolean audioVideoOnDemand;

    private boolean inSeatPower;

    private boolean wifi;

    //each airline can have many flights
    //each flight has only one airline.
    @OneToMany(mappedBy = "airline", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Flight> flights = new HashSet<>();

}
