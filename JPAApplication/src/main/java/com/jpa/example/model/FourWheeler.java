package com.jpa.example.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity(name = "FOUR_WHEELER")
//@DiscriminatorValue(value = "FOUR_WHEELER")
@PrimaryKeyJoinColumn
public class FourWheeler extends Vehicle{
}
