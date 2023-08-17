package com.example.dndavorionwikibackend.Model.Characters;

import com.example.dndavorionwikibackend.Model.Calendar.WorldDate;
import com.example.dndavorionwikibackend.Model.Gods.Gods;
import com.example.dndavorionwikibackend.Model.Species.Species;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
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

    @ManyToOne(optional = true, fetch = FetchType.LAZY)
    @JoinColumn(name = "GODS_ID")
    private Gods god;

    @ManyToOne(optional = true, fetch = FetchType.LAZY)
    @JoinColumn(name = "SPECIES_ID")
    private Species species;


    public long getCharacterId() {
        return characterId;
    }

    public void setCharacterId(long characterId) {
        this.characterId = characterId;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
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
