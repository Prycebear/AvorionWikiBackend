package com.example.dndavorionwikibackend.Model.Locations;

import com.example.dndavorionwikibackend.Model.Characters.NonPlayerCharacter;
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
    @JoinColumn(name = "LOCATIONS_IN_SUBNATIONS", referencedColumnName = "LOCATION_ID")
    private Set<Locations> locations;

    @OneToOne
    @JoinColumn(name = "SUBNATION_LEADER", referencedColumnName = "CHARACTER_ID")
    private NonPlayerCharacter nonPlayerCharacter;
}
