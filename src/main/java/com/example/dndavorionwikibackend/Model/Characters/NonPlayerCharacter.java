package com.example.dndavorionwikibackend.Model.Characters;

import com.example.dndavorionwikibackend.Model.Campaign.Session;
import com.example.dndavorionwikibackend.Model.FantayRole.FantasyRole;
import com.example.dndavorionwikibackend.Model.Locations.Continent;
import com.example.dndavorionwikibackend.Model.Locations.LocationSuper;
import com.example.dndavorionwikibackend.Model.Locations.Locations;
import com.example.dndavorionwikibackend.Model.Locations.Nation;
import com.example.dndavorionwikibackend.Model.Species.Species;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.CascadeType;

import java.util.Set;

@Entity
@Table(name = "NPC")
public class NonPlayerCharacter extends CharacterSuper{

    @OneToOne(mappedBy = "leaderId")
    private Continent continentId;

    @ManyToMany(mappedBy = "nonPlayerCharacters")
    private Set<Session> sessions;





}
