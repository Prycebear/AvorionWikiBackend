package com.example.dndavorionwikibackend.Model.Species;

import com.example.dndavorionwikibackend.Model.Characters.PlayerCharacter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import org.hibernate.annotations.CascadeType;


import java.util.List;
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

    @Column(name="SPECIES_DESCRIPTION",columnDefinition = "TEXT")
    private String speciesShortDescription;

    @Column(name="SPECIES_DESCRIPTION", columnDefinition = "TEXT")
    private String speciesDescription;

    @OneToMany
    @JsonIgnore
    @JoinColumn(name = "SPECIES_ID")
    private Set<PlayerCharacter> characterSpecies;

    @Column(name="SPECIES_IMGLINK", columnDefinition = "TEXT")
    private String speciesImgLink;

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
}
