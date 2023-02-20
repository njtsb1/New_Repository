package com.nivaldo.beirao.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
//import javax.persistence.OneToMany; //uncomment

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Location {
    @Id
    private  long id;
    @ManyToOne
    private LevelAccess levelAccess;
    private String description;
}
