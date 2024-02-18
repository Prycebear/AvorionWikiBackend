package com.example.dndavorionwikibackend.Model.Locations;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="POINTOFINTEREST")
public class PointOfInterest extends LocationSuper{

    public enum PointOfInterestType{
        Shop,
        Keep,
        House,
        Graveyard,
        Inn,
        Church,
        Parks,
        Other
    }
    @ManyToOne
    @JoinColumn(name = "locations_location_id")
    private Locations locations;

    @Column(columnDefinition = "TEXT")
    private PointOfInterestType pointOfInterestType;

    public Locations getLocations() {
        return locations;
    }

    public void setLocations(Locations locations) {
        this.locations = locations;
    }

}
