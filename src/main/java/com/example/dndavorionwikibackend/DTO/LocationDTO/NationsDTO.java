package com.example.dndavorionwikibackend.DTO.LocationDTO;

import com.example.dndavorionwikibackend.Model.Locations.SubNation;

import java.util.Set;

public class NationsDTO extends LocationsSuperDTO{

    private Set<SubNation> subNations;

    public Set<SubNation> getSubNations() {
        return subNations;
    }

    public void setSubNations(Set<SubNation> subNations) {
        this.subNations = subNations;
    }
}
