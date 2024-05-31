package com.example.dndavorionwikibackend.Translation.LocationTranslator;

import com.example.dndavorionwikibackend.DTO.LocationDTO.ContinentDTO;
import com.example.dndavorionwikibackend.DTO.SpeciesDTO.SpeciesDTO;
import com.example.dndavorionwikibackend.Model.Locations.Continent;
import com.example.dndavorionwikibackend.Model.Species.Species;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class ContinentTranslator {

    private ModelMapper modelMapper;

    public ContinentTranslator() {
        this.modelMapper = new ModelMapper();
    }

    public ContinentDTO continentToContinentDTO(Continent continent) {
        return modelMapper.map(continent, ContinentDTO.class);
    }

    public Continent continentDTOToContinent(ContinentDTO continentDTO) {
        return modelMapper.map(continentDTO, Continent.class);
    }
}

