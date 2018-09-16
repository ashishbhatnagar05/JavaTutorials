package com.jpa.example.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity(name = "TWO_WHEELER")
//@DiscriminatorValue(value = "TWO_WHEELER")
@PrimaryKeyJoinColumn
public class TwoWheeler extends Vehicle {
}
