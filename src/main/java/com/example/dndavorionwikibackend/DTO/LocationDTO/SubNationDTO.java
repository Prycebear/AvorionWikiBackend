package com.example.dndavorionwikibackend.DTO.LocationDTO;

import com.example.dndavorionwikibackend.Model.LocationsModels.Locations;
import com.example.dndavorionwikibackend.Model.LocationsModels.Nation;

import java.util.Set;

public class SubNationDTO extends LocationsSuperDTO{

    private Set<Locations> locations;

    private Nation nation;

    public Set<Locations> getLocations() {
        return locations;
    }

    public void setLocations(Set<Locations> locations) {
        this.locations = locations;
    }

    public Nation getNation() {
        return nation;
    }

    public void setNation(Nation nation) {
        this.nation = nation;
    }
}
