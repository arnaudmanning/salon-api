package com.arsalon.salonapi.domain;

import org.springframework.beans.factory.annotation.Value;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class SalonServiceDetail {

    @Id
    @GeneratedValue()
    Long id;

    @Value("app.name")
    String name;

    @Value("app.address")
    String address;

    @Value("app.city")
    String city;

    @Value("app.state")
    String state;

    @Value("app.zipcode")
    int zipcode;

    @Value("app.phone")
    String phone;
}
