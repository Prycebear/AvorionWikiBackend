package com.example.dndavorionwikibackend.Model.Locations;


import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.Set;

@Entity
@Table(name = "CONTINENTS")
public class Continent extends LocationSuper{

    public Continent() {
        
    }

    @OneToMany
    @JoinColumn(name = "LOCATION_ID")
    private Set<Nation> nations;

    public Continent(int i, String s) {
        super();
    }


    public Set<Nation> getNations() {
        return nations;
    }

    public void setNations(Set<Nation> nations) {
        this.nations = nations;
    }
}
