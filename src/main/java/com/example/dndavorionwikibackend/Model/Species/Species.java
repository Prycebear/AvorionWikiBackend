package com.example.dndavorionwikibackend.Model.Species;

import com.example.dndavorionwikibackend.Model.Characters.CharacterSuper;
import com.example.dndavorionwikibackend.Model.Characters.NonPlayerCharacter;
import com.example.dndavorionwikibackend.Model.Characters.PlayerCharacter;
import jakarta.annotation.Nonnull;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


import java.util.Set;

@Entity
@Table(name = "SPECIES")
public class Species {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SPECIES_ID", nullable = false, unique = true)
    private long speciesId;

    private String speciesName;

    private String speciesShortDescription;

    private String speciesDescription;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "SPECIES_ID")
    private Set<PlayerCharacter> characterSpecies;

    public long getSpeciesId() {
        return speciesId;
    }

    public void setSpeciesId(long speciesId) {
        this.speciesId = speciesId;
    }

    public String getSpeciesName() {
        return speciesName;
    }

    public void setSpeciesName(String speciesName) {
        this.speciesName = speciesName;
    }

    public String getSpeciesShortDescription() {
        return speciesShortDescription;
    }

    public void setSpeciesShortDescription(String speciesShortDescription) {
        this.speciesShortDescription = speciesShortDescription;
    }

    public String getSpeciesDescription() {
        return speciesDescription;
    }

    public void setSpeciesDescription(String speciesDescription) {
        this.speciesDescription = speciesDescription;
    }

    public Set<PlayerCharacter> getCharacterSpecies() {
        return characterSpecies;
    }

    public void setCharacterSpecies(Set<PlayerCharacter> characterSpecies) {
        this.characterSpecies = characterSpecies;
    }
}
