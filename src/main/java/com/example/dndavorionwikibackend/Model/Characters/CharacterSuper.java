package com.example.dndavorionwikibackend.Model.Characters;

import com.example.dndavorionwikibackend.Model.Gods.Gods;
import com.example.dndavorionwikibackend.Model.Species.Species;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MappedSuperclass;


import java.util.Set;

@MappedSuperclass
public class CharacterSuper {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CHARACTER_ID", nullable = false, unique = true)
    private long characterId;

    @Column(name="CHARACTER_FIRST_NAME")
    private String characterFirstName;

    @Column(name="CHARACTER_LAST_NAME")
    private String characterLastName;

    @Column(name="CHARACTER_DESCRIPTION", columnDefinition = "TEXT")
    private String characterDescription;

    @Column(name="SHORT_CHARACTER_DESCRIPTION", columnDefinition = "TEXT")
    private String shortCharacterDescription;

    @ManyToOne(optional = true)
    @JoinColumn(name = "GODS_ID")
    private Gods god;

    @JsonIgnore
    @ManyToOne(optional = true, fetch = FetchType.LAZY)
    @JoinColumn(name = "SPECIES_ID")
    private Species species;

    @JoinColumn(name = "CHARACTER_IMAGE_LINK")
    private String characterImageLink;


    public long getCharacterId() {
        return characterId;
    }

    public void setCharacterId(long characterId) {
        this.characterId = characterId;
    }

    public String getCharacterFirstName() {
        System.out.println(characterFirstName);
        return characterFirstName;
    }

    public void setCharacterFirstName(String characterFirstName) {
        this.characterFirstName = characterFirstName;
    }

    public String getCharacterLastName() {
        return characterLastName;
    }

    public void setCharacterLastName(String characterLastName) {
        this.characterLastName = characterLastName;
    }

    public String getCharacterImageLink() {
        return characterImageLink;
    }

    public void setCharacterImageLink(String characterImageLink) {
        this.characterImageLink = characterImageLink;
    }

    public String getCharacterDescription() {
        return characterDescription;
    }

    public void setCharacterDescription(String characterDescription) {
        this.characterDescription = characterDescription;
    }

    public String getShortCharacterDescription() {
        return shortCharacterDescription;
    }

    public void setShortCharacterDescription(String shortCharacterDescription) {
        this.shortCharacterDescription = shortCharacterDescription;
    }

    public Gods getGod() {
        return god;
    }

    public void setGod(Gods god) {
        this.god = god;
    }

    public Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }
}
