package com.example.dndavorionwikibackend.Model.Characters;

import com.example.dndavorionwikibackend.Model.Gods.Gods;
import com.example.dndavorionwikibackend.Model.Species.Species;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
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
    @Column(name = "CHARACTER_ID", nullable = false, unique = true)
    private long characterId;

    @Column(name="CHARACTER_NAME")
    private String characterName;

    @Column(name="CHARACTER_DESCRIPTION", columnDefinition = "TEXT")
    private String characterDescription;

    @Column(name="SHORT_CHARACTER_DESCRIPTION", columnDefinition = "TEXT")
    private String shortCharacterDescription;

    @ManyToOne
    @JoinColumn(name = "GODS_ID")
    private Gods god;

    @ManyToOne
    @JoinColumn(name = "SPECIES_ID")
    private Species species;







}
