package com.example.dndavorionwikibackend.DTO.LocationDTO;


import com.example.dndavorionwikibackend.Model.Characters.NonPlayerCharacter;
import com.example.dndavorionwikibackend.Model.Locations.Nation;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

import java.util.Set;

public class ContinentDTO {

    public ContinentDTO() {
    }

    private long locationId;

    private String locationName;


    private String shortLocationDescription;


    private String locationDescription;


    private NonPlayerCharacter leaderId;

    private Set<Nation> nations;

    public long getLocationId() {
        return locationId;
    }

    public void setLocationId(long locationId) {
        this.locationId = locationId;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getShortLocationDescription() {
        return shortLocationDescription;
    }

    public void setShortLocationDescription(String shortLocationDescription) {
        this.shortLocationDescription = shortLocationDescription;
    }

    public String getLocationDescription() {
        return locationDescription;
    }

    public void setLocationDescription(String locationDescription) {
        this.locationDescription = locationDescription;
    }

    public NonPlayerCharacter getLeaderId() {
        return leaderId;
    }

    public void setLeaderId(NonPlayerCharacter leaderId) {
        this.leaderId = leaderId;
    }

    public Set<Nation> getNations() {
        return nations;
    }

    public void setNations(Set<Nation> nations) {
        this.nations = nations;
    }
}
