package com.example.dndavorionwikibackend.Model.Characters;

import com.example.dndavorionwikibackend.Model.Species.Species;
import jakarta.persistence.CascadeType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

import java.util.Set;

@MappedSuperclass
public class CharacterSuper {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long characterId;

    private String characterName;

    private long characterHistoryId;

    private long characterLocationId;

    private String characterBirthDate;

    private String characterDeathDate;

    private String characterDescription;







}
