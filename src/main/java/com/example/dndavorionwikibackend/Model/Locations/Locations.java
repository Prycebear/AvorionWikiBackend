package com.example.dndavorionwikibackend.Model.Locations;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.Set;

@Entity
@Table(name="LOCATIONS")
public class Locations extends LocationSuper{

    public enum LocationType{
        Capital,
        City,
        Town,
        Village,
        Port,
        Ruin,
        Castle,
        Dungeon,
        Mountain,
        Forest,
        Desert,
        Ocean,
        Sea,
        Lake,
        River,
        Canyon,
        Cave,
        Battle
    }

    @ManyToOne
    @JoinColumn(name = "sub_nation_location_id")
    private SubNation subNation;

    @OneToMany
    @JoinColumn(name = "LOCATION_ID")
    private Set<PointOfInterest> poi;

    @Column(columnDefinition = "TEXT")
    private LocationType locationType;

    public SubNation getSubNation() {
        return subNation;
    }

    public void setSubNation(SubNation subNation) {
        this.subNation = subNation;
    }

    public LocationType getLocationType() {
        return locationType;
    }

    public void setLocationType(LocationType locationType) {
        this.locationType = locationType;
    }
}
