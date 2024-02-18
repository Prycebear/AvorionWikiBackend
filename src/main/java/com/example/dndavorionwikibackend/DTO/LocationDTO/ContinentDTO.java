package com.example.dndavorionwikibackend.DTO.LocationDTO;

import com.example.dndavorionwikibackend.Model.LocationsModels.Nation;

import java.util.Set;

public class ContinentDTO extends LocationsSuperDTO{

    private Set<Nation> nations;

    public Set<Nation> getNations() {
        return nations;
    }

    public void setNations(Set<Nation> nations) {
        this.nations = nations;
    }
}
