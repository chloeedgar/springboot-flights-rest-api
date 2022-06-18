package com.springboot.flights.restapi.entity;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "users", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"email"})
})
public class Passenger {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String givenNames;

    @Column(nullable = false)
    private String surnames;

    @Column(nullable = false)
    private String nationality;

    @Column(nullable = false)
    private String gender;

    @Column(nullable = false, length = 9)
    private String passportNumber;

    @Column(nullable = false)
    private Date dateOfBirth;

    @Column(nullable = false)
    private Date passportExpiryDate;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String phone;

}
