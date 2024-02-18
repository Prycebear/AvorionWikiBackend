package com.example.dndavorionwikibackend.DTO.LocationDTO;

import com.example.dndavorionwikibackend.Model.LocationsModels.Continent;
import com.example.dndavorionwikibackend.Model.LocationsModels.SubNation;

import java.util.Set;

public class NationsDTO extends LocationsSuperDTO{

    private Set<SubNation> subNations;

    private Continent continent;

    public Set<SubNation> getSubNations() {
        return subNations;
    }

    public void setSubNations(Set<SubNation> subNations) {
        this.subNations = subNations;
    }

    public Continent getContinent() {
        return continent;
    }

    public void setContinent(Continent continent) {
        this.continent = continent;
    }
}
