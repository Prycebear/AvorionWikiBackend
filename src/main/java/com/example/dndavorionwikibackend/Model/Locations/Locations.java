package com.example.dndavorionwikibackend.Model.Locations;

import com.example.dndavorionwikibackend.Model.Characters.NonPlayerCharacter;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="LOCATIONS")
public class Locations extends LocationSuper{

    @OneToOne
    @JoinColumn(name = "LOCATION_LEADER", referencedColumnName = "CHARACTER_ID")
    private NonPlayerCharacter nonPlayerCharacter;


}
