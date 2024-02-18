package com.example.dndavorionwikibackend.Translation.LocationTranslator;

import com.example.dndavorionwikibackend.DTO.LocationDTO.LocationsDTO;
import com.example.dndavorionwikibackend.Model.LocationsModels.Locations;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class LocationsTranslator {
    private ModelMapper modelMapper;

    public LocationsTranslator() {
        this.modelMapper = new ModelMapper();
    }

    public LocationsDTO locationsToLocationsDTO (Locations locations){
        return modelMapper.map(locations, LocationsDTO.class);
    }

    public Locations locationsDTOToLocations (LocationsDTO locationsDTO){
        return modelMapper.map(locationsDTO, Locations.class);
    }
}
