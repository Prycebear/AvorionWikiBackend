package com.example.dndavorionwikibackend.Model.Locations;

import com.example.dndavorionwikibackend.Model.Characters.NonPlayerCharacter;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

import java.util.Set;

@Entity
@Table(name="SUBNATION")
public class SubNation extends LocationSuper{

    @OneToMany
    @JoinColumn(name = "LOCATION_ID")
    private Set<Locations> locations;
}
