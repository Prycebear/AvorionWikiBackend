package com.example.dndavorionwikibackend.Model.Characters;

import com.example.dndavorionwikibackend.Model.Locations.Continent;
import com.example.dndavorionwikibackend.Model.Locations.LocationSuper;
import com.example.dndavorionwikibackend.Model.Species.Species;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

import java.util.Set;

@Entity
@Table(name = "NPC")
public class NonPlayerCharacter extends CharacterSuper{

    @ManyToMany
    @JoinColumn(name = "NPC_TO_SPECIES", referencedColumnName = "CHARACTER_SPECIES")
    private Set<Species> NPCSpecies;





}
