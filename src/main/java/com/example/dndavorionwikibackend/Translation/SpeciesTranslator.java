package com.example.dndavorionwikibackend.Translation;

import com.example.dndavorionwikibackend.DTO.SpeciesDTO.SpeciesDTO;
import com.example.dndavorionwikibackend.Model.Species.Species;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class SpeciesTranslator {

    private ModelMapper modelMapper;

    public SpeciesTranslator() {
        this.modelMapper = new ModelMapper();
    }

    public SpeciesDTO speciesToSpeciesDTO (Species species){
        return modelMapper.map(species, SpeciesDTO.class);
    }

    public Species speciesDTOToSpecies (SpeciesDTO speciesDTO){
        return modelMapper.map(speciesDTO, Species.class);
    }
}
