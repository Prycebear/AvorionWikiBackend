package com.example.dndavorionwikibackend.Translation.LocationTranslator;

import com.example.dndavorionwikibackend.DTO.LocationDTO.SubNationDTO;
import com.example.dndavorionwikibackend.Model.LocationsModels.SubNation;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class SubNationTranslator {
    private ModelMapper modelMapper;

    public SubNationTranslator() {
        this.modelMapper = new ModelMapper();
    }

     public SubNationDTO subNationToSubNationDTO (SubNation subNation){
        return modelMapper.map(subNation, SubNationDTO.class);
    }

    public SubNation subNationDTOToSubNation (SubNationDTO subNationsDTO){
        return modelMapper.map(subNationsDTO, SubNation.class);
    }
}
