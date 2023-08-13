package com.example.dndavorionwikibackend.Model.Characters;

import com.example.dndavorionwikibackend.Model.FantayRole.FantasyRole;
import com.example.dndavorionwikibackend.Model.Gods.Gods;
import com.example.dndavorionwikibackend.Model.Species.Species;
import com.example.dndavorionwikibackend.Model.User.ApplicationUser;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

import java.util.Set;

@Entity
@Table(name = "PLAYER_CHARACTER")
public class PlayerCharacter extends CharacterSuper{

    @ManyToOne(fetch = FetchType.LAZY)
    private ApplicationUser owner;

    @ManyToOne(fetch = FetchType.LAZY)
    private Species playerCharacterSpecies;

    @ManyToOne(fetch = FetchType.LAZY)
    private FantasyRole characterRole;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CHARACTER_GOD")
    private Gods characterGod;



}
