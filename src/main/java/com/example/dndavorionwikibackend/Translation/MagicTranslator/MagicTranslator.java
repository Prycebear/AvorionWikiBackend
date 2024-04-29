package com.example.dndavorionwikibackend.Translation.MagicTranslator;

import com.example.dndavorionwikibackend.DTO.MagicDTO.MagicDTO;
import com.example.dndavorionwikibackend.DTO.SpeciesDTO.SpeciesDTO;
import com.example.dndavorionwikibackend.Model.Magic.Magic;
import com.example.dndavorionwikibackend.Model.Species.Species;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class MagicTranslator {
    private ModelMapper modelMapper;

    public MagicTranslator() {
        this.modelMapper = new ModelMapper();
    }

    public MagicDTO magicToMagicDTO (Magic magic){
        return modelMapper.map(magic, MagicDTO.class);
    }

    public Magic magicDTOToMagic (MagicDTO magicDTO){
        return modelMapper.map(magicDTO, Magic.class);
    }
}


