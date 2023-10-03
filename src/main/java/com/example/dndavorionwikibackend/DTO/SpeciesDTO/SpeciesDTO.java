package com.example.dndavorionwikibackend.DTO.SpeciesDTO;

import com.example.dndavorionwikibackend.Model.Characters.PlayerCharacter;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

import java.util.List;

public class SpeciesDTO {

    public SpeciesDTO() {
    }

    public long speciesId;

    public String speciesName;

    public String speciesShortDescription;

    public String speciesDescription;

    public List<PlayerCharacter> characterSpecies;

    public void setSpeciesId(long speciesId) {
        this.speciesId = speciesId;
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

    public void setCharacterSpecies(List<PlayerCharacter> characterSpecies) {
        this.characterSpecies = characterSpecies;
    }
}
