package com.jpa.example.model.mapping.bidirectional.manytomany;

import javax.persistence.*;
import java.util.List;

@Entity(name = "B_MANY_TO_MANY_E1")
public class Entity1 {
    @Id
    @GeneratedValue
    @Column(name = "E1_ID")
    private Integer id;

    @ManyToMany(mappedBy = "entity1")
    //@PrimaryKeyJoinColumn
    //@JoinColumn
    //@JoinTable(name = "B_MANY_TO_MANY_E1_E2")
    private List<Entity2> entity2;

}
