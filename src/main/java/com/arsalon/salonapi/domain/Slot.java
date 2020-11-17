package com.arsalon.salonapi.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Slot {

    @Id
    @GeneratedValue()
    Long id;
}
