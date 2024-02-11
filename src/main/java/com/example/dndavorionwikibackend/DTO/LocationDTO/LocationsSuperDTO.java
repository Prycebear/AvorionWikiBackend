package com.example.dndavorionwikibackend.DTO.LocationDTO;

import com.example.dndavorionwikibackend.Model.Characters.NonPlayerCharacter;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

public class LocationsSuperDTO {

    private long locationId;

    private String locationName;


    private String shortLocationDescription;


    private String locationDescription;


    private NonPlayerCharacter leaderId;

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
}
