package com.example.dndavorionwikibackend.Model.Characters;

import com.example.dndavorionwikibackend.Model.Species.Species;
import com.example.dndavorionwikibackend.Model.User.ApplicationUser;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Table;

import java.util.Set;

@Entity
@Table(name = "PLAYER_CHARACTER")
public class PlayerCharacter extends CharacterSuper{

    @ManyToOne
    @JoinColumn(name = "USER_TO_CHARACTER", referencedColumnName = "APPLICATION_USER_ID")
    private ApplicationUser owner;

    @ManyToMany
    @JoinColumn(name = "CHARACTER_TO_SPECIES", referencedColumnName = "CHARACTER_SPECIES")
    private Set<Species> characterSpecies;



}
