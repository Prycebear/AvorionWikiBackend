package com.example.dndavorionwikibackend.DTO.SpeciesDTO;

import com.example.dndavorionwikibackend.Model.Characters.PlayerCharacter;

import java.util.List;

public class SpeciesDTO {

    public SpeciesDTO() {
    }

    public String speciesName;

    public String speciesShortDescription;

    public String speciesDescription;


    private String speciesImgLink;


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


    public String getSpeciesImgLink() {
        return speciesImgLink;
    }

    public void setSpeciesImgLink(String speciesImgLink) {
        this.speciesImgLink = speciesImgLink;
    }
}
