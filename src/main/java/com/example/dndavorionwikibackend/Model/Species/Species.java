package com.example.dndavorionwikibackend.Model.Species;

import com.example.dndavorionwikibackend.Model.Characters.PlayerCharacter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
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

    @Column(name="SPECIES_NAME")
    private String speciesName;

    @Column(name="SPECIES_SHORT_DESCRIPTION",columnDefinition = "TEXT")
    private String speciesShortDescription;

    @Column(name="SPECIES_DESCRIPTION", columnDefinition = "TEXT")
    private String speciesDescription;

    @OneToMany
    @JoinColumn(name = "SPECIES_ID")
    @JsonIgnore
    private Set<PlayerCharacter> characterSpecies;

    @Column(name="SPECIES_IMG_LINK", columnDefinition = "TEXT")
    private String speciesImgLink;

//    public Species(String speciesName, String speciesShortDescription, String speciesDescription) {
//        this.speciesName = speciesName;
//        this.speciesShortDescription = speciesShortDescription;
//        this.speciesDescription = speciesDescription;
//    }

    public long getSpeciesId() {
        return speciesId;
    }

    public String getSpeciesName() {
        return speciesName;
    }

    public String getSpeciesShortDescription() {
        return speciesShortDescription;
    }

    public String getSpeciesDescription() {
        return speciesDescription;
    }

    public Set<PlayerCharacter> getCharacterSpecies() {
        return characterSpecies;
    }

    public String getSpeciesImgLink() {
        return speciesImgLink;
    }


    public void setSpeciesName(String speciesName) {
        this.speciesName = speciesName;
    }

    public void setSpeciesShortDescription(String speciesShortDescription) {
        this.speciesShortDescription = speciesShortDescription;
    }

    public void setSpeciesDescription(String speciesDescription) {
        this.speciesDescription = speciesDescription;
    }

    public void setCharacterSpecies(Set<PlayerCharacter> characterSpecies) {
        this.characterSpecies = characterSpecies;
    }

    public void setSpeciesImgLink(String speciesImgLink) {
        this.speciesImgLink = speciesImgLink;
    }
}
