package com.example.dndavorionwikibackend.Translation.GodsTranslator;

import com.example.dndavorionwikibackend.DTO.GodsDTO.GodsDTO;
import com.example.dndavorionwikibackend.Model.Gods.Gods;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class GodsTranslator {

    private ModelMapper modelMapper;

    public GodsTranslator() {
        this.modelMapper = new ModelMapper();
    }

    public GodsDTO godsToGodsDTO (Gods gods){
        return modelMapper.map(gods, GodsDTO.class);
    }

    public Gods godsDTOToGods (GodsDTO godsDTO){
        return modelMapper.map(godsDTO, Gods.class);
    }
}
