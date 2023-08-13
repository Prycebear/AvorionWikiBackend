package com.example.dndavorionwikibackend.Model.Locations;

import com.example.dndavorionwikibackend.Model.Characters.NonPlayerCharacter;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

import java.util.Set;

@Entity
@Table(name = "NATION")
public class Nation extends LocationSuper{

    @OneToMany
    @JoinColumn(name = "SUBNATIONS_IN_NATION", referencedColumnName = "LOCATION_ID")
    private Set<SubNation> subnations;

    @OneToOne
    @JoinColumn(name = "NATION_LEADER", referencedColumnName = "CHARACTER_ID")
    private NonPlayerCharacter nonPlayerCharacter;
}
