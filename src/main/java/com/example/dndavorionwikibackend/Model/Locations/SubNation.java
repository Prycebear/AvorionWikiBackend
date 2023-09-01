package com.example.dndavorionwikibackend.Model.Locations;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.Set;

@Entity
@Table(name="SUBNATION")
public class SubNation extends LocationSuper{

    @OneToMany
    @JoinColumn(name = "LOCATION_ID")
    private Set<Locations> locations;
}
