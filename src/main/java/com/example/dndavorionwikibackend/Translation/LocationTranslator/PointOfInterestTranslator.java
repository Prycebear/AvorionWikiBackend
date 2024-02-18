package com.example.dndavorionwikibackend.Translation.LocationTranslator;

import com.example.dndavorionwikibackend.DTO.LocationDTO.PointOfInterestDTO;
import com.example.dndavorionwikibackend.Model.LocationsModels.PointOfInterest;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class PointOfInterestTranslator {
    private ModelMapper modelMapper;

    public PointOfInterestTranslator() {
        this.modelMapper = new ModelMapper();
    }

    public PointOfInterestDTO pointOfInterestToPointOfInterestDTO (PointOfInterest pointOfInterest){
        return modelMapper.map(pointOfInterest, PointOfInterestDTO.class);
    }

    public PointOfInterest PointOfInterestDTOTopointOfInterest(PointOfInterestDTO pointOfInterestDTO){
        return modelMapper.map(pointOfInterestDTO, PointOfInterest.class);
    }
}
