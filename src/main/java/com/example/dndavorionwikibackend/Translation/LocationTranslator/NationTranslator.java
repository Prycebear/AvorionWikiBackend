package com.example.dndavorionwikibackend.Translation.LocationTranslator;

import com.example.dndavorionwikibackend.DTO.LocationDTO.NationsDTO;
import com.example.dndavorionwikibackend.Model.LocationsModels.Nation;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;


@Service
public class NationTranslator {

    private ModelMapper modelMapper;

    public NationTranslator() {
        this.modelMapper = new ModelMapper();
    }

    public NationsDTO nationToNationDTO (Nation nation){
        return modelMapper.map(nation, NationsDTO.class);
    }

    public Nation nationDTOToNation (NationsDTO nationsDTO){
        return modelMapper.map(nationsDTO, Nation.class);
    }
}
