package com.example.dndavorionwikibackend.DTO.CharactersDTO;

import com.example.dndavorionwikibackend.Model.Gods.Gods;
import com.example.dndavorionwikibackend.Model.Species.Species;

public class CharacterSuperDTO {

    private long characterId;

    private String characterFirstName;

    private String characterLastName;

    private String characterDescription;

    private String shortCharacterDescription;

    private Gods god;

//    private Species species;

    private String characterImageLink;

    public long getCharacterId() {
        return characterId;
    }

    public void setCharacterId(long characterId) {
        this.characterId = characterId;
    }

    public String getCharacterFirstName() {
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

//    public Species getSpecies() {
//        return species;
//    }
//
//    public void setSpecies(Species species) {
//        this.species = species;
//    }

    public String getCharacterImageLink() {
        return characterImageLink;
    }

    public void setCharacterImageLink(String characterImageLink) {
        this.characterImageLink = characterImageLink;
    }
}
