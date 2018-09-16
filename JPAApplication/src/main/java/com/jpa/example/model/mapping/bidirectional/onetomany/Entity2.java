package com.jpa.example.model.mapping.bidirectional.onetomany;

import javax.persistence.*;
import java.util.List;

@Entity(name = "B_ONE_TO_MANY_E2")
public class Entity2 {
    @Id
    @GeneratedValue
    @Column(name = "E2_ID")
    private Integer id;
    @ManyToOne
   // @PrimaryKeyJoinColumn
    //@JoinColumn
    //@JoinTable(name = "B_ONE_TO_MANY_E1_E2")
    private Entity1 entity1;

}
