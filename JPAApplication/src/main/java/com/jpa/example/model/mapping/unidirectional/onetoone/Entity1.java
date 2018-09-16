package com.jpa.example.model.mapping.unidirectional.onetoone;

import javax.persistence.*;

@Entity(name = "U_ONE_TO_ONE_E1")
public class Entity1 {
    @Id
    @GeneratedValue
    @Column(name = "E1_ID")
    private Integer id;

    @OneToOne
    //@PrimaryKeyJoinColumn
    //@JoinColumn(name = "E2_ID")
    //@JoinTable
    private Entity2 entity2;

}
