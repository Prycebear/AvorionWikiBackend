package com.example.dndavorionwikibackend.Model.Locations;


import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.Set;

@Entity
@Table(name = "NATION")
public class Nation extends LocationSuper{

    @OneToMany
    @JoinColumn(name = "LOCATION_ID")
    private Set<SubNation> subNations;


}
