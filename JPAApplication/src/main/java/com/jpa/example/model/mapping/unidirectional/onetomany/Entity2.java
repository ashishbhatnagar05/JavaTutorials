package com.jpa.example.model.mapping.unidirectional.onetomany;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "U_ONE_TO_MANY_E2")
public class Entity2 {
@Id
@GeneratedValue
@Column(name="E2_ID")
private Integer id;


}
