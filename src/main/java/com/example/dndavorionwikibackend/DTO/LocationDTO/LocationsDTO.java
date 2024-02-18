package com.example.dndavorionwikibackend.DTO.LocationDTO;

import com.example.dndavorionwikibackend.Model.LocationsModels.Locations;
import com.example.dndavorionwikibackend.Model.LocationsModels.PointOfInterest;
import com.example.dndavorionwikibackend.Model.LocationsModels.SubNation;

import java.util.Set;

public class LocationsDTO extends LocationsSuperDTO{


    private SubNation subNation;


    private Set<PointOfInterest> poi;


    private Locations.LocationType locationType;

    public SubNation getSubNation() {
        return subNation;
    }

    public void setSubNation(SubNation subNation) {
        this.subNation = subNation;
    }

    public Set<PointOfInterest> getPoi() {
        return poi;
    }

    public void setPoi(Set<PointOfInterest> poi) {
        this.poi = poi;
    }

    public Locations.LocationType getLocationType() {
        return locationType;
    }

    public void setLocationType(Locations.LocationType locationType) {
        this.locationType = locationType;
    }
}
