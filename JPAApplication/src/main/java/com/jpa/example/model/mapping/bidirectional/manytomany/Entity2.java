package com.jpa.example.model.mapping.bidirectional.manytomany;

import javax.persistence.*;
import java.util.List;

@Entity(name = "B_MANY_TO_MANY_E2")
public class Entity2 {
@Id
@GeneratedValue
@Column(name="E2_ID")
private Integer id;
@ManyToMany
//@PrimaryKeyJoinColumn
//@JoinColumn
//@JoinTable(name = "B_MANY_TO_MANY_E2_E1")
private List<Entity1> entity1;
}
