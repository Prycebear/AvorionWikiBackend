package com.example.dndavorionwikibackend.Model.Characters;

import com.example.dndavorionwikibackend.Model.Campaign.Session;
import com.example.dndavorionwikibackend.Model.Locations.Continent;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

import java.util.Set;

@Entity
@Table(name = "NPC")
public class NonPlayerCharacter extends CharacterSuper{

    @OneToOne(mappedBy = "leaderId")
    private Continent continentId;

    @ManyToMany(mappedBy = "nonPlayerCharacters")
    private Set<Session> sessions;





}
