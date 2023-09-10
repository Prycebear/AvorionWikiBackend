package com.example.dndavorionwikibackend.Model.Locations;

import com.example.dndavorionwikibackend.Model.Characters.NonPlayerCharacter;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.OneToOne;


@MappedSuperclass
public class LocationSuper {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "LOCATION_ID", nullable = false, unique = true)
    private long locationId;

    private String locationName;

    @Column(columnDefinition = "TEXT")
    private String shortLocationDescription;

    @Column(columnDefinition = "TEXT")
    private String locationDescription;

    @OneToOne
    @JoinColumn(name = "CHARACTER_ID", referencedColumnName = "CHARACTER_ID")
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
