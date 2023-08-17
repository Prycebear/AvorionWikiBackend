package com.example.dndavorionwikibackend.Model.FantayRole;

import com.example.dndavorionwikibackend.Model.Characters.CharacterSuper;
import com.example.dndavorionwikibackend.Model.Characters.NonPlayerCharacter;
import com.example.dndavorionwikibackend.Model.Characters.PlayerCharacter;
import com.example.dndavorionwikibackend.Model.History.History;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

import java.util.Set;

@Entity
@Table(name = "FANTASY_ROLE")
public class FantasyRole {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ROLE_ID", nullable = false, unique = true)
    private long roleId;

//    @ManyToMany
//    @JoinTable(
//            name = "PLAYER_CHARACTER_ROLE",
//            joinColumns = @JoinColumn(name = "CHARACTER_ID"),
//            inverseJoinColumns = @JoinColumn(name = "WORLD_DATE_ID"))
//    private Set<PlayerCharacter> histories;
}
