package com.jpa.example.model.mapping.bidirectional.onetoone;

import javax.persistence.*;

@Entity(name = "B_ONE_TO_ONE_E1")
public class Entity1 {
    @Id
    @GeneratedValue
    @Column(name = "E1_ID")
    private Integer id;

    @OneToOne
    //@PrimaryKeyJoinColumn
    //@JoinColumn
    //@JoinTable(name = "B_ONE_TO_ONE_E1_E2__1", joinColumns = @JoinColumn(name = "E2_ID"))
    private Entity2 entity2;

}
