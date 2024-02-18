package com.example.dndavorionwikibackend.Model.Locations;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.Set;

@Entity
@Table(name="SUBNATION")
public class SubNation extends LocationSuper{

    @OneToMany
    @JoinColumn(name = "LOCATION_ID")
    private Set<Locations> locations;

    @ManyToOne
    @JoinColumn(name = "nation_location_id")
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
