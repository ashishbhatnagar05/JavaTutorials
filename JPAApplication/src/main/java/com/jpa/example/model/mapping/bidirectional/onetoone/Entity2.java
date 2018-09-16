package com.jpa.example.model.mapping.bidirectional.onetoone;

import javax.persistence.*;

@Entity(name = "B_ONE_TO_ONE_E2")
public class Entity2 {
@Id
@GeneratedValue
@Column(name="E2_ID")
private Integer id;

    @OneToOne(/*mappedBy = "entity2"*/)
    //@PrimaryKeyJoinColumn
    //@JoinColumn
    //@JoinTable(name = "B_ONE_TO_ONE_E1_E2__2", joinColumns = @JoinColumn(name = "E2_ID"))
    private Entity1 entity1;
}
