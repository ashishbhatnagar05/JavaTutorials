package com.jpa.example.model;

import javax.persistence.*;

@Entity(name = "VEHICLE")
@Inheritance(strategy = InheritanceType.JOINED)
/*@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "D_TYPE", discriminatorType = DiscriminatorType.STRING)*/
public abstract class Vehicle {

    @Id
    @GeneratedValue
    public Integer id;
    public String name;
}
